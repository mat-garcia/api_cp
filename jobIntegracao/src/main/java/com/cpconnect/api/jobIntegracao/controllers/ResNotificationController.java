package com.cpconnect.api.jobIntegracao.controllers;

import com.cpconnect.api.jobIntegracao.models.ResNotification;
import com.cpconnect.api.jobIntegracao.services.ResNotificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
@SuppressWarnings("unused")
public class ResNotificationController {
    private final ResNotificationService resNotificationService;

    public ResNotificationController(ResNotificationService resNotificationService) {
        this.resNotificationService = resNotificationService;
    }

    @GetMapping(value = "/get_res")
    public List<ResNotification> getReservas(){
        return resNotificationService.getReservaList();
    }
    @PostMapping(value = "/insert_res")
    public ResponseEntity<Object> createRes(@RequestBody ResNotification request) throws SQLException {
        ResNotification reserva = new ResNotification(request.getMessageId(),request.getData());
        long idReserva = resNotificationService.createReserva(reserva);

        if(false) {
            InsertResOk response = new InsertResOk(idReserva);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else{
            InsertResError response = new InsertResError("Erro ao tentar inserir a Reserva");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }


    }

    //api custon responses
    class InsertResOk {
        private final long returnId;


        public InsertResOk(long returnId) {
            this.returnId = returnId;
        }

        public long getReturnId() {
            return returnId;
        }
    }
    class InsertResError{
        private String error;

        public InsertResError(String error) {
            this.error = error;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }
    }

}
