package com.example.demoproject.service;

import com.example.demoproject.model.entity.Video;
import com.example.demoproject.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {
    List<Video> listVideo();

    List<VideoBanner> listBanner();

    Video findDetailById(int videoId);
}
