package ${groupId}.controller;

import ${groupId}.openapi.api.SecuredApi;
import ${groupId}.openapi.model.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecuredController implements SecuredApi {

    @Override
    public ResponseEntity<BaseResponse> getSampleSecuredMessage() {

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMessage("Hello from secured endpoint");

        return ResponseEntity.ok(baseResponse);
    }
}
