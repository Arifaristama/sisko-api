package practice.project.sisko.api.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import practice.project.sisko.api.model.entity.FakultasEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FakultasRes {
    private String id;
    private String code;
    private String name;

    public FakultasRes(FakultasEntity fakultasEntity) {
        this.id = fakultasEntity.getId();
        this.code = fakultasEntity.getCode();
        this.name = fakultasEntity.getName();
    }
}
