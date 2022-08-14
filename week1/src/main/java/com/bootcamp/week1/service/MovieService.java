package com.bootcamp.week1.service;
import java.util.List;
import com.bootcamp.week1.vo.MovieVO;
 
public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}