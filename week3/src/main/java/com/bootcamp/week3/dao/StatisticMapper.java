package com.bootcamp.week3.dao;
import java.util.HashMap;
import java.util.List;

import com.bootcamp.week3.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    
    public HashMap<String, Object> selectMonthLogin(String year, String month); // API-1: 월 별 접속자 수
    public HashMap<String, Object> selectDayLogin(String date); // API-2: 일자 별 접속자 수
    public HashMap<String, Object> selectAvgDayLogin(String year, String month); // API-3: 평균 하루 로그 수
    public HashMap<String, Object> selectNoHolidayLogin(String year, String month); // API-4: 휴일 제외 로그인 수 
    public List<HashMap<String, Object>> selectDeptLogin(String year, String month); // API-5: 부서별 월별 로그인 
}