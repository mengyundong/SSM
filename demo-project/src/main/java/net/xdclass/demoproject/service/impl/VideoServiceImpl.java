package net.xdclass.demoproject.service.impl;

import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.mapper.VideoMapper;
import net.xdclass.demoproject.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}
