package ${groupId}.controller;

import ${groupId}.openapi.api.UnsecuredApi;
import ${groupId}.openapi.model.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UnsecuredController implements UnsecuredApi {

    @Override
    public ResponseEntity<BaseResponse> getSampleMessage() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMessage("Hello from unsecured endpoint");

        return ResponseEntity.ok(baseResponse);
    }
}
