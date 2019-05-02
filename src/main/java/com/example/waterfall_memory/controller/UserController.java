package com.example.waterfall_memory.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.waterfall_memory.service.FallService;
import com.example.waterfall_memory.util.AesCbcUtil;
import com.example.waterfall_memory.util.HttpRequest;

import net.sf.json.JSONObject;
import net.sf.json.JSONString;

@RestController
public class UserController {
	@Resource
	private FallService service;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping("/decodeUserInfo")
    public Map decodeUserInfo(String encryptedData, String iv, String code) {
		Map map = new HashMap();
		// 登录凭证不能为空
		if (code == null || code.length() == 0) {
			map.put("status", 0);
			map.put("msg", "code 不能为空");
			return map;
		}
		// 小程序唯一标识 (在微信小程序管理后台获取)
		String wxspAppid = "wx18385lalalala";
		// 小程序的 app secret (在微信小程序管理后台获取)
		String wxspSecret = "bef47459d81a6eflalalalala";
		// 授权（必填）
		String grant_type = "authorization_code";
	
		//////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid//////////////// ////////////////
		// 请求参数
		String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type="
				+ grant_type;
		// 发送请求
		String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
		// 解析相应内容（转换成json对象）
		JSONObject json =JSONObject.fromString(sr);
		// 获取会话密钥（session_key）
		String session_key = json.get("session_key").toString();
		// 用户的唯一标识（openid）
		String openid = (String) json.get("openid");
	
		//////////////// 2、对encryptedData加密数据进行AES解密 ////////////////
		try {
			String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
			if (null != result && result.length() > 0) {
				map.put("status", 1);
				map.put("msg", "解密成功");
	
				JSONObject userInfoJSON = JSONObject.fromString(result);
				Map userInfo = new HashMap();
				userInfo.put("openId", userInfoJSON.get("openId"));
				userInfo.put("nickName", userInfoJSON.get("nickName"));
				userInfo.put("gender", userInfoJSON.get("gender"));
				userInfo.put("city", userInfoJSON.get("city"));
				userInfo.put("province", userInfoJSON.get("province"));
				userInfo.put("country", userInfoJSON.get("country"));
				userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));
				// 解密unionId & openId;
	
				userInfo.put("unionId", userInfoJSON.get("unionId"));
				map.put("userInfo", userInfo);
			} else {
				map.put("status", 0);
				map.put("msg", "解密失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

}
