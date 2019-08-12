package ru.ncd.controllers;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import ru.ncd.Data;
import ru.ncd.Matrix;
import ru.ncd.MyContextListener;

import java.io.FileNotFoundException;



@Controller
public class FileController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() throws FileNotFoundException {
        return "mainPage";

    }

    @RequestMapping(value = "/buttonFile", method = RequestMethod.GET)
    public @ResponseBody String buttonFile(ModelMap model) throws FileNotFoundException {
        WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(MyContextListener.sc);
        Data data = (Data)context.getBean("data");
        String str = data.getDataFromFile();
      //  Data data = new Data();
      //  String str = data.getDataFromFile();
        return str;

    }

}