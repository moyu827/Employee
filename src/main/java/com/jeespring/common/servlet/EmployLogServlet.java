package com.jeespring.common.servlet;

import com.google.gson.Gson;
import com.jeespring.common.config.Global;
import com.jeespring.common.utils.CharsetKit;
import com.jeespring.modules.employ.entity.LogData;
import com.jeespring.modules.employ.service.LogDataService;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.util.UriUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 查看CK上传的图片
 *
 * @author 黄炳桂 516821420@qq.com
 * @version 2014-06-25
 */
@WebServlet(urlPatterns = "/QAMachineService/UploadpassedLog")
public class EmployLogServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final static Gson GSON = new Gson();

    @Autowired
    private LogDataService logDataService;

    public void userLogUpload(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        String xmlData = IOUtils.toString(req.getInputStream(), CharsetKit.GBK);
        String code = req.getParameter("code");
        String pass = req.getParameter("pass");
        String data = req.getParameter("data");
        LogData logData = GSON.fromJson(data, LogData.class);
//        LogData logData = new LogData();
        logDataService.save(logData);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        userLogUpload(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        userLogUpload(req, resp);
    }
}
