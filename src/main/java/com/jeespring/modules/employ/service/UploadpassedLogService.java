package com.jeespring.modules.employ.service;

import com.jeespring.common.persistence.Page;
import com.jeespring.common.service.AbstractBaseService;
import com.jeespring.modules.employ.dao.UploadpassedLogDao;
import com.jeespring.modules.employ.entity.UploadpassedLog;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2020/4/10.
 */
@Service
@Transactional(readOnly = true)
public class UploadpassedLogService extends AbstractBaseService<UploadpassedLogDao,UploadpassedLog> implements IUploadpassedLogService {


    @Override
    public UploadpassedLog getCache(String id) {
        return null;
    }

    @Override
    public List<UploadpassedLog> totalCache(UploadpassedLog entity) {
        return null;
    }

    @Override
    public List<UploadpassedLog> findListCache(UploadpassedLog entity) {
        return null;
    }

    @Override
    public Page<UploadpassedLog> findPageCache(Page<UploadpassedLog> page, UploadpassedLog entity) {
        return null;
    }
}
