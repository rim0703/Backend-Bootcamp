package com.bootcamp.week1.dao;
import java.util.List;
import com.bootcamp.week1.vo.MovieVO;
 
public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}