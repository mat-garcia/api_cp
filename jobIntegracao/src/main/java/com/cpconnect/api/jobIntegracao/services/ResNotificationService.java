package com.cpconnect.api.jobIntegracao.services;

import com.cpconnect.api.jobIntegracao.models.Booking;
import com.cpconnect.api.jobIntegracao.models.ResNotification;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class ResNotificationService {
    LocalDate hoje = LocalDate.now();
    // Configurar a conexão com o banco de dados
    String url = "jdbc:mysql://localhost:3306/lotus";
    String user = "root";
    String password = "1234";
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private final List<ResNotification> reservas = new ArrayList<>();


    public long createReserva(ResNotification reserva) throws SQLException {
        Booking booking = reserva.getData().getBooking();
        // Preparar a declaração SQL para inserir a reserva
        PreparedStatement statement = connection.prepareStatement("INSERT INTO reserva (ATIVO,DATA_INCLUSAO,SOBRE_NOME,CODIGO_CANAL,CODIGO_HOTEL,CODIGO_PARCEIRO,COD_TARIFA,CV_CARTAO,DT_CHEGADA,DT_OPERACAO,DT_SAIDA,LOCALIZADOR,LOCALIZADOR_EXTRAS,MOEDA_RESERVA, NOME_AGENCIA, NOME_CANAL, STATUS, ID_EMPRESA, ID_USUARIO_INCLUSAO, ID_PARCEIRO,IDENTICADOR_PAGAMENTO,MOEDA_TARIFA,NOME_CARTAO,NOME_CLIENTE, NOME_PARCEIRO, NUMERO_CARTAO, TIPO_CARTAO ,TIPO_GARANTIA,TIPO_PAGAMENTO,ID_TRANSACTION,UNIQUE_ID_PARCEIRO, UNIQUE_RESERVA_CANAL, UNIQUE_RESERVA_PARCEIRO,VALIDADE_CARTAO,VALOR_BRUTO,VALOR_TOTAL,VERSAO,XML) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,0,0,3,?)", Statement.RETURN_GENERATED_KEYS);

        statement.setInt(1, 1);
        statement.setString(2, hoje.toString());
        statement.setString(3, booking.getGuests().get(0).getSurname());
        statement.setString(4, booking.getChannel());
        statement.setString(5, booking.getProperty().getHotelPMSId());
        statement.setString(6, "B2B");
        statement.setString(7, "01");
        statement.setString(8, "-");
        statement.setString(9, booking.getStartDate());
        statement.setString(10, reserva.getData().getTimestamp());
        statement.setString(11, booking.getEndDate());
        statement.setString(12, booking.getLocator());
        statement.setString(13, booking.getChannel() + booking.getLocator());
        statement.setString(14, booking.getTotal().getCurrencyCode());
        statement.setString(15, booking.getCustomer().getName());
        statement.setString(16, booking.getChannel());
        statement.setString(17, "SOLICITADA");
        statement.setInt(18, 2);
        statement.setInt(19, 4);
        statement.setInt(20, 3);
        statement.setString(21, "-");
        statement.setString(22, booking.getRates().get(0).getCurrencyCode());
        statement.setString(23, "-");
        statement.setString(24, booking.getGuests().get(0).getSurname() + " " + booking.getGuests().get(0).getName());
        statement.setString(25, "B2B");
        statement.setString(26, "-");
        statement.setString(27, "-");
        statement.setString(28, "-");
        statement.setString(29, "-");
        statement.setInt(30, 0);
        statement.setString(31, "123");
        statement.setString(32, "123");
        statement.setString(33, "123");
        statement.setString(34, "-");
        statement.setString(35, "1wadwa6d");


        // Executar a declaração SQL e obter o ID gerado pelo banco de dados
        statement.executeUpdate();
        ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            long id = resultSet.getLong(1);
            // Retornar o ID da reserva inserida
            return  id;
    }



    public List<ResNotification> getReservaList() {
        return reservas;
    }
}
