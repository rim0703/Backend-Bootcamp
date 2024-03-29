package com.bootcamp.week1.service;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
 
import com.bootcamp.week1.dao.MovieDAO;
import com.bootcamp.week1.vo.MovieVO;
 
@Service
public class MovieServiceImpl implements MovieService {
 
    @Inject
    private MovieDAO dao;
    
    @Override
    public List<MovieVO> selectMovie() throws Exception {
 
        return dao.selectMovie();
    }
 
}