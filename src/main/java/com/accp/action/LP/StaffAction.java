package com.accp.action.LP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.LP.StaffBiz;
import com.accp.pojo.Handle;
import com.accp.pojo.Site;
import com.accp.pojo.Staff;

@RestController
@RequestMapping("/api/lingpeng")
@Component("LPStaffAction")
public class StaffAction {
	@Autowired
	private StaffBiz staffBiz;

	@GetMapping("/loginIn/{name}/{pwd}")
	public Map<String, Object> loginIn(@PathVariable String name, @PathVariable String pwd, HttpSession session) {
		Staff staff = staffBiz.login(name, pwd);
		Map<String, Object> message = new HashMap<String, Object>();
		if (staff != null) {
			session.setAttribute("USER", staff);// 服务器保存
			message.put("code", "200");
			message.put("msg", "ok");
			message.put("data", staff);// 客户端保存
		} else {
			message.put("code", "300");
			message.put("msg", "login_error");
		}

		return message;
	}

	@GetMapping("/loginOut")
	public Map<String, Object> loginOut(HttpSession session) throws Exception {
		Map<String, Object> message = new HashMap<String, Object>();
		session.removeAttribute("USER");
		session.invalidate();// 立即失效
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@GetMapping("/getSessionUser")
	public Staff getUserInfo(HttpSession session) throws Exception {
		Staff user = (Staff) session.getAttribute("USER");
		return user;
	}

//	@GetMapping("/getFunTree")
//	public List getUserFunTree(HttpSession session) {
//		// 从session获得用户，以便得到权限
//		Staff user = (Staff) session.getAttribute("USER");
//		List tree = new ArrayList();
//		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
//		for (Handle fun : user.getPosition().getList()) {
//			menuNames.add(fun.getChildren().getHanname());
//		}
//		// 遍历一级菜单名称，生成二级菜单项
//		for (String name : menuNames) {
//			// 节点【初始化】
//			Map<String, Object> node = new HashMap<String, Object>();
//			node.put("id", 0);//0:根级菜单
//			node.put("text", name);
//			List nodeChild = new ArrayList();
//			for (Handle fun : user.getPosition().getList()) {
//				// 匹配是否是当前菜单的子项
//				if (name.equals(fun.getChildren().getHanname())) {
//					Map<String, Object> n = new HashMap<String, Object>();
//					n.put("id", fun.getHancode());
//					n.put("text", fun.getHanname());
//					nodeChild.add(n);
//				}
//			}
//			node.put("children", nodeChild);
//			tree.add(node);
//		}
//		return tree;
//	}
	
	@GetMapping("/getFunTree")
	public List getUserFunTree(HttpSession session) {
		// 从session获得用户，以便得到权限
		Staff user = (Staff) session.getAttribute("USER");
		List tree = new ArrayList();
		Set<Handle> menuNames = new HashSet<Handle>();// 剔除重复值，保存一级菜单名称
		for (Handle fun : user.getPosition().getList()) {
			menuNames.add(fun.getChildren());
		}
		// 遍历一级菜单名称，生成二级菜单项
		for (Handle name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", 0);
			node.put("text", name);
			List nodeChild = new ArrayList();
			for (Handle fun : user.getPosition().getList()) {
				// 匹配是否是当前菜单的子项
				if (name.getHanname().equals(fun.getChildren().getHanname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", fun.getHancode());
					n.put("text", fun);
					nodeChild.add(n);
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}
		return tree;
	}

}
