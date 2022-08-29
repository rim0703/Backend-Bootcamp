package com.bootcamp.week3.service;
 
import java.util.HashMap;
import java.util.List;
 
public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    
    public HashMap<String,Object> monthloginNum (String year, String month);
    public HashMap<String,Object> dayloginNum (String date);
    public HashMap<String,Object> avgloginNum (String year, String month);
    public HashMap<String,Object> noholidayloginNum (String year, String month);
    public HashMap<String,Object> deptloginNum (String year, String month);
}