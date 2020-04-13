package com.jeespring.modules.employ.service;

import com.jeespring.common.persistence.Page;
import com.jeespring.common.service.AbstractBaseService;
import com.jeespring.modules.employ.dao.LogDataDao;
import com.jeespring.modules.employ.entity.LogData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2020/4/11.
 */
@Service
@Transactional(readOnly = true)
public class LogDataService extends AbstractBaseService<LogDataDao, LogData> implements ILogDataService {
    @Override
    public LogData getCache(String id) {
        return null;
    }

    @Override
    public List<LogData> totalCache(LogData entity) {
        return null;
    }

    @Override
    public List<LogData> findListCache(LogData entity) {
        return null;
    }

    @Override
    public Page<LogData> findPageCache(Page<LogData> page, LogData entity) {
        return null;
    }

    @Override
    public void save(LogData logData){
        super.save(logData);
    }
}
