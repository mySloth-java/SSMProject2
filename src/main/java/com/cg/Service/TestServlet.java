package com.cg.Service;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(value = "/request")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //根据map集合获取请求参数
//        Map<String, String[]> parameterMap = req.getParameterMap();
//        for (String key :
//                parameterMap.keySet()) {
//            System.out.print("用户名:"+key+"   ");
//
//            for (String value :
//                    parameterMap.get(key)) {
//                System.out.println("密码:"+value);
//            }
//        }
        //获取登录列表的信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //调用数据库对比，判断给予跳转反馈或者错误提示




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
