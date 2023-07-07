package org.mifos.pheevouchermanagementsystem.api.definition;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

public interface VoucherLifecycleManagementApi {
    @PutMapping("/vouchers")
    <T> ResponseEntity<T> voucherStatusChange(@RequestHeader(value="X-CallbackURL") String callbackURL,
                                                    @RequestBody Object requestBody, @RequestParam(value = "command") String command) throws ExecutionException, InterruptedException, JsonProcessingException;
}
