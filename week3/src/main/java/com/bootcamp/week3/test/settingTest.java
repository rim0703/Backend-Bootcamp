package com.bootcamp.week3.test;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.bootcamp.week3.dao.StatisticMapper;
import com.bootcamp.week3.service.StatisticService;
 
 
 
@Controller
public class settingTest {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/sqlyearStatistic")
    public Map<String, Object> sqltest(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @ResponseBody
    @RequestMapping("/stat/monthly")
    public Map<String, Object> sqltest_API_1(String year, String month) throws Exception{ 
        return service.monthloginNum(year, month);
    }
    
    @ResponseBody
    @RequestMapping("/stat/daily")
    public Map<String, Object> sqltest_API_2(String date) throws Exception{ 
        return service.dayloginNum(date);
    }
    
    @ResponseBody
    @RequestMapping("/stat/average")
    public Map<String, Object> sqltest_API_3(String year, String month) throws Exception{ 
        return service.avgloginNum(year, month);
    }
    
    @ResponseBody
    @RequestMapping("/stat/noHoliday")
    public Map<String, Object> sqltest_API_4(String year, String month) throws Exception{ 
        return service.noholidayloginNum(year, month);
    }
    
    @ResponseBody
    @RequestMapping("/stat/dept")
    public Map<String, Object> sqltest_API_5(String year, String month) throws Exception{ 
        return service.deptloginNum(year, month);
    }
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}