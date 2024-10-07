package practice.project.sisko.api.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import practice.project.sisko.api.model.entity.FakultasEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FakultasReq {
    private String id;
    private String code;
    private String name;


    public FakultasReq(FakultasEntity fakultasEntity) {
        this.id = fakultasEntity.getId();
        this.code = fakultasEntity.getCode();
        this.name = fakultasEntity.getName();
    }
}
