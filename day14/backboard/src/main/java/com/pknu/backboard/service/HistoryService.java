package com.pknu.backboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.backboard.entity.About;
import com.pknu.backboard.entity.History;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HistoryService {

    @Autowired
    private final HistoryRepository HistoryRepository;

    public void setHistory(About about, String year, String description) {
        History history = new History();
        
    }
}
