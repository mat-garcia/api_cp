package com.cpconnect.api.jobIntegracao.controllers;

import com.cpconnect.api.jobIntegracao.models.ResNotification;
import com.cpconnect.api.jobIntegracao.services.ResNotificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.hdnit.lotus.domain.entity.corporativo.Reserva;
import br.com.hdnit.lotus.domain.entity.corporativo.dao.impl.ReservaDAOImpl;

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
    public ResponseEntity<Object> createRes(@RequestBody ResNotification request) throws Exception {

        //Transforma o JSON em Objeto
        ResNotification reservaNotification = new ResNotification(request.getMessageId(),request.getData());



        try{
            long idReserva = resNotificationService.processarReserva(reservaNotification);
            InsertResOk response = new InsertResOk(idReserva);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e){
            InsertResError response = new InsertResError("Erro ao processar a Reserva");
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
