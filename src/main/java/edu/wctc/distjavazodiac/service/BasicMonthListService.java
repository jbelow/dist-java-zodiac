package edu.wctc.distjavazodiac.service;

//import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.distjavazodiac.entity.Month;
import edu.wctc.distjavazodiac.repo.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BasicMonthListService implements MonthListService {
//    private List<Month> monthList;
//
//    @Override
//    public List<Month> getMonths() {
//        return monthList;
//    }

    @Autowired
    private MonthRepository monthRepository;

    @Override
    public List<Month> getMonths() {
        List<Month> month = new ArrayList<>();
        monthRepository.findAll().forEach(month::add);
        return month;
    }

//    @Autowired
//    private LocationRepository locationRepository;
//
//    @Override
//    public List<Location> getLocationList() {
//        List<Location> list = new ArrayList<>();
//        locationRepository.findAllByOrderByCountryAscName().forEach(list::add);
//        return list;
//    }
}
