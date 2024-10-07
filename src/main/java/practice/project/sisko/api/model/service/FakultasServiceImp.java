package practice.project.sisko.api.model.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import practice.project.sisko.api.model.entity.FakultasEntity;
import practice.project.sisko.api.model.repository.FakultasRepo;
import practice.project.sisko.api.model.response.FakultasRes;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class FakultasServiceImp implements FakultasService {

    private final FakultasRepo repo;

    public FakultasServiceImp(FakultasRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<FakultasRes> get() {
        List<FakultasEntity> list = repo.findAll();
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        return list.stream().map(FakultasRes::new).collect(Collectors.toList());
    }
}
