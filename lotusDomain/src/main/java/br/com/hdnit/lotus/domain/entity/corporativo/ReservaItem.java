/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hdnit.lotus.domain.entity.corporativo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.opentravel.ota._2003._05.ArrayOfRateTypeRate;
import org.opentravel.ota._2003._05.RoomStayType.RoomRates.RoomRate;
import org.opentravel.ota2010a.GuestCountType.GuestCount;
import org.opentravel.ota2010a.RateType;
import org.opentravel.ota2010a.RoomStayType;
import org.opentravel.ota2010a.RoomStaysType.RoomStay;

import com.belaviagem.www.wsdl.hotelService.Guest;
import com.belaviagem.www.wsdl.hotelService.Room;

import br.com.hdnit.lotus.domain.entity.enums.StatusReservaEnum;
import br.com.hdnit.lotus.domain.entity.enums.TipoPensaoEnum;
import br.com.hdnit.lotus.foundation.util.DateUtils;
import br.com.hdnit.lotus.foundation.util.TextUtils;
import br.com.hdnit.lotus.foundation.util.exception.ValidacaoCampoException;
import br.com.lotus.connector.services.OrderRoom;
import br.com.lotus.connector.services.OrderRoomPrice;
import br.com.novaxs.rest.data.Method;
import br.com.novaxs.rest.data.Payment;
import br.com.novaxs.rest.data.Rate;
import br.com.novaxs.rest.data.RateValue;

/**
 * 
 * @author hdn
 */
@Entity
@Table(name = "reserva_item")
//@Audited
@XmlRootElement
public class ReservaItem implements Serializable {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReservaItem [id=");
		builder.append(id);
		builder.append(", idReservaPms=");
		builder.append(idReservaPms);
		builder.append(", numeroReservaPms=");
		builder.append(numeroReservaPms);
		builder.append(", tipoPensao=");
		builder.append(tipoPensao);
		builder.append(", indexApto=");
		builder.append(indexApto);
		builder.append(", tipoApto=");
		builder.append(tipoApto);
		builder.append(", qtdApto=");
		builder.append(qtdApto);
		builder.append(", qtdAdultos=");
		builder.append(qtdAdultos);
		builder.append(", qtdCriancas=");
		builder.append(qtdCriancas);
		builder.append("]");
		return builder.toString();
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "ID_RESERVA")
	@JsonIgnore
	private Reserva reserva;
		
	@Column(name = "ID_RESERVA_PMS", nullable = true)
	private String idReservaPms;

	@Column(name = "NUMERO_RESERVA_PMS", nullable = true)
	private String numeroReservaPms;

	@Column(name = "MARK_UP", nullable = true)
	private Double markUp;

	@Column(name = "ISS", nullable = true)
	private Double iss;

	@Column(name = "COD_TIPO_PENSAO", nullable = true)
	private String tipoPensao;

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = true)
	private StatusReservaEnum status = StatusReservaEnum.SOLICITADA;
	
	public StatusReservaEnum getStatus() {
		return status;
	}

	public void setStatus(StatusReservaEnum status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reservaItem", orphanRemoval = true, cascade = {
			javax.persistence.CascadeType.ALL })
	private List<ReservaItemValor> reservaItensValor;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reservaItem", orphanRemoval = true, cascade = {
			javax.persistence.CascadeType.ALL })
	private List<ReservaItemLancamento> reservaItensLancamento;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reservaItem", orphanRemoval = true, cascade = {
			javax.persistence.CascadeType.ALL })
	private List<ReservaHospede> reservaHospede;
	
	/**
	 * APARTAMENTO
	 * 
	 */

	@Column(name = "CODIGO_HOTEL", nullable = false)
	private String codigoHotel;

	@Column(name = "IDX_APTO", nullable = false)
	private String indexApto;

	@Column(name = "TIPO_APTO", nullable = false)
	private String tipoApto;

	@Column(name = "QTD_APTO", nullable = false)
	private String qtdApto;

	@Column(name = "QTD_ADULTOS", nullable = true)
	private String qtdAdultos;

	@Column(name = "QTD_CRIANCAS", nullable = true)
	private String qtdCriancas = "0";

	@Column(name = "FUMANTE", nullable = false)
	private Integer fumante;

	@Column(name = "VALOR_TOTAL", nullable = true)
	private String valorTotal;

	@Column(name = "CODE", nullable = true)
	private String code;
	
	@Column(name = "OBSERVACAO", nullable = true)
	private String observacao;
	
	@Column(name = "SERVICO", nullable = true, length = 2000)
	private String servico;

	@Transient
	private Boolean encontrou;
	
	public Boolean getEncontrou() {
		return encontrou;
	}

	public void setEncontrou(Boolean encontrou) {
		this.encontrou = encontrou;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoHotel() {
		return codigoHotel;
	}

	public void setCodigoHotel(String codigoHotel) {
		this.codigoHotel = codigoHotel;
	}

	public String getIndexApto() {
		return indexApto;
	}

	public void setIndexApto(String indexApto) {
		this.indexApto = indexApto;
	}

	public String getTipoApto() {
		return tipoApto;
	}

	public void setTipoApto(String tipoApto) {
		this.tipoApto = tipoApto;
	}

	public String getQtdApto() {
		return qtdApto;
	}

	public void setQtdApto(String qtdApto) {
		this.qtdApto = qtdApto;
	}

	public String getQtdAdultos() {
		return qtdAdultos;
	}

	public void setQtdAdultos(String qtdAdultos) {
		this.qtdAdultos = qtdAdultos;
	}

	public String getQtdCriancas() {
		return qtdCriancas;
	}

	public void setQtdCriancas(String qtdCriancas) {
		this.qtdCriancas = qtdCriancas;
	}
	
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
	
	
	
	public List<ReservaHospede> getReservaHospede() {
		if (reservaHospede == null) {
			reservaHospede = new ArrayList<ReservaHospede>();
		}

		return reservaHospede;
	}

	public void setReservaHospede(List<ReservaHospede> reservaHospede) {
		this.reservaHospede = reservaHospede;
	}

	public ReservaItem() {

	}

	public ReservaItem(Room roomStay) {

		if (roomStay.getRoomTypeId() == null) {
			return;
		}

		this.setCodigoHotel("laghetto");
		this.setIndexApto(roomStay.getRoomTypeId().toString());
		this.setTipoApto(roomStay.getRoomType());
		// this.setQtdApto(roomStay.getRoomTypes().getRoomType().get(0).getNumberOfUnits().toString());
		this.setQtdApto("-");
		double valorTotalLocal = 0D;

		/*
		 * if (roomStay.getRoomTypes().getRoomType().get(0).isNonSmoking()) {
		 * this.setFumante(0); } else { this.setFumante(1); }
		 */
		int adultos = 0;
		int criancas = 0;

		this.setFumante(1);

		for (Guest g : roomStay.getGuests()) {
			if (g.getGuestAge() >= 18) {
				adultos++;
			} else if (g.getGuestAge() < 18) {
				criancas++;
			}
		}

		this.setQtdAdultos(String.valueOf(adultos));
		this.setQtdCriancas(String.valueOf(criancas));
		this.setCode(roomStay.getCode());

		/*
		 * for (RoomStayType.RoomRates.RoomRate g :
		 * roomStay.getRoomRates().getRoomRate()) {
		 * 
		 * for (RateType.Rate rate : g.getRates().getRate()) { if
		 * (rate.getTotal().getAmountAfterTax() != null) { valorTotalLocal =
		 * valorTotalLocal + rate.getTotal().getAmountAfterTax().doubleValue(); } } }
		 */

		this.valorTotal = String.valueOf(roomStay.getRoomAmount());
		// this.valorTotal = String.valueOf(valorTotalLocal);

	}

	public ReservaItem(RoomStay roomStay) {
		this.setCodigoHotel(roomStay.getBasicPropertyInfo().getHotelCode());
		this.setIndexApto(roomStay.getIndexNumber().toString());
		this.setTipoApto(roomStay.getRoomTypes().getRoomType().get(0).getRoomTypeCode());
		this.setQtdApto(roomStay.getRoomTypes().getRoomType().get(0).getNumberOfUnits().toString());

		double valorTotalLocal = 0D;

		if (roomStay.getRoomTypes().getRoomType().get(0).isNonSmoking()) {
			this.setFumante(0);
		} else {
			this.setFumante(1);
		}

		for (GuestCount g : roomStay.getGuestCounts().getGuestCount()) {
			if (g.getAgeQualifyingCode() != null && g.getAgeQualifyingCode().equals("10")) {
				this.setQtdAdultos(g.getCount().toString());

			} else if (g.getAgeQualifyingCode() != null && g.getAgeQualifyingCode().equals("8")) {
				this.setQtdCriancas(g.getCount().toString());

			}
		}

		for (RoomStayType.RoomRates.RoomRate g : roomStay.getRoomRates().getRoomRate()) {

			for (RateType.Rate rate : g.getRates().getRate()) {

				if (rate.getTotal().getAmountAfterTax() != null) {
					valorTotalLocal = valorTotalLocal + rate.getTotal().getAmountAfterTax().doubleValue();
				}
			}
		}

		this.valorTotal = String.valueOf(valorTotalLocal);
	}

	public ReservaItem(OrderRoom room, String hotelCode) {
		// TODO Auto-generated constructor stub
		this.setCodigoHotel(hotelCode);
		this.setIndexApto(room.getSequence().toString());

		if (room.getRoomId() != null) {
			this.setTipoApto(room.getRoomId() + "");
		} else {
			this.setTipoApto("INDEFINIDO");
		}

		this.setQtdApto(room.getNumRooms().toString());

		this.setFumante(0);
		this.setQtdAdultos(room.getNumAdults() + "");
		this.setQtdCriancas(room.getNumChildren() + "");

		if (room.getMealType() != null && !room.getMealType().getValue().isEmpty()) {

			this.tipoPensao = room.getMealType().getValue();

		} else {
			this.tipoPensao = TipoPensaoEnum.Unspecified.getId() + "";
		}

		buildDiarias(room);
	}

	public void calcularTotal() {
		double valorTotalLocal = 0D;

		for (ReservaItemValor itemValor : this.getReservaItensValor()) {
			BigDecimal valorOrcamento = new BigDecimal(itemValor.getValorDiaria());
			valorTotalLocal = valorTotalLocal + valorOrcamento.doubleValue();
		}
		this.valorTotal = String.valueOf(valorTotalLocal);

	}
		
	public void buildDiarias(OrderRoom room) {
		//double valorTotalLocal = 0D;

		for (OrderRoomPrice g : room.getPrices()) {
			if (g.getPrice() != null) {

				Calendar c1 = DateUtils.getInstance().getCalendar();

				c1.setTimeInMillis(g.getDate().getTimeInMillis());
				c1.add(Calendar.DAY_OF_MONTH, 1);

				Date dataDiaria = c1.getTime();
				Boolean exists = Boolean.FALSE;
				for (ReservaItemValor rt : this.getReservaItensValor()) {
					if (rt.getDataDiaria().getTime() == dataDiaria.getTime()) {
						exists = Boolean.TRUE;
						break;
					}
				}

				if (!exists) {
					ReservaItemValor itemValor = new ReservaItemValor();

					itemValor.setDataDiaria(dataDiaria);
					itemValor.setReservaItem(this);
					itemValor.setValorDiaria(String.valueOf(g.getPrice().doubleValue()));
					this.getReservaItensValor().add(itemValor);

					//valorTotalLocal = valorTotalLocal + g.getPrice().doubleValue();
				}
			}
		}

		calcularTotal();
	}
	
	// Omnibees
	public ReservaItem(org.opentravel.ota._2003._05.ArrayOfRoomStay.RoomStay roomStay, String hotelCode) {
		// TODO Auto-generated constructor stub
		this.setCodigoHotel(hotelCode);
		this.setIndexApto(roomStay.getIndexNumber().toString());
		double valorTotalLocal = 0D;

		if (roomStay.getRoomTypes() != null && roomStay.getRoomTypes().getRoomType() != null
				&& !roomStay.getRoomTypes().getRoomType().isEmpty()) {
			this.setTipoApto(roomStay.getRoomTypes().getRoomType().get(0).getRoomTypeCode());
		} else {
			this.setTipoApto("INDEFINIDO");
		}

		this.setQtdApto(roomStay.getRoomRates().getRoomRate().get(0).getNumberOfUnits() + "");

		// if (roomStay.getRoomTypes().getRoomType().get(0).isNonSmoking()) {
		this.setFumante(0);
		// } else {
		// this.setFumante(1);
		// }

		for (org.opentravel.ota._2003._05.GuestCountType.GuestCount g : roomStay.getGuestCounts().getGuestCount()) {
			if (g.getAgeQualifyingCode() != null && g.getAgeQualifyingCode().equals("10")) {
				int qtdAdultos = (this.getQtdAdultos() != null && !this.getQtdAdultos().isEmpty()
						? Integer.valueOf(this.getQtdAdultos())
						: 0);
				qtdAdultos = qtdAdultos + g.getCount();
				this.setQtdAdultos(qtdAdultos + "");

			} else if (g.getAgeQualifyingCode() != null
					&& (g.getAgeQualifyingCode().equals("8") || g.getAgeQualifyingCode().equals("9"))) {
				int qtdCriancas = (this.getQtdCriancas() != null && !this.getQtdCriancas().isEmpty()
						? Integer.valueOf(this.getQtdCriancas())
						: 0);
				qtdCriancas = qtdCriancas + g.getCount();
				this.setQtdCriancas(qtdCriancas + "");

			}
		}

		if (roomStay.getRatePlans() != null && roomStay.getRatePlans().getRatePlan() != null
				&& !roomStay.getRatePlans().getRatePlan().isEmpty()
				&& roomStay.getRatePlans().getRatePlan().get(0).getMealsIncluded() != null
				&& roomStay.getRatePlans().getRatePlan().get(0).getMealsIncluded().getMealPlanCodes() != null
				&& !roomStay.getRatePlans().getRatePlan().get(0).getMealsIncluded().getMealPlanCodes().isEmpty()) {
			this.tipoPensao = roomStay.getRatePlans().getRatePlan().get(0).getMealsIncluded().getMealPlanCodes().get(0);
//		} else if (roomStay.getRatePlans() != null && roomStay.getRatePlans().getRatePlan() != null
//				&& !roomStay.getRatePlans().getRatePlan().isEmpty()
//				&& roomStay.getRatePlans().getRatePlan().get(0) != null
//				&& roomStay.getRatePlans().getRatePlan().get(0).getRatePlanCode() != null) {
//
//			this.tipoPensao = roomStay.getRatePlans().getRatePlan().get(0).getRatePlanCode();
		} else {
			this.tipoPensao = TipoPensaoEnum.Unspecified.getId() + "";
		}
		
		for (RoomRate g : roomStay.getRoomRates().getRoomRate()) {

			for (ArrayOfRateTypeRate.Rate rate : g.getRates().getRate()) {
				if (rate.getTotal().getAmountAfterTax() != null) {

					Date dataDiaria = rate.getEffectiveDate().toGregorianCalendar().getTime();
					Boolean exists = Boolean.FALSE;
					for (ReservaItemValor rt : this.getReservaItensValor()) {
						if (rt.getDataDiaria().getTime() == dataDiaria.getTime()) {
							exists = Boolean.TRUE;
							break;
						}
					}
					if (!exists) {
						ReservaItemValor itemValor = new ReservaItemValor();

						itemValor.setDataDiaria(dataDiaria);
						itemValor.setReservaItem(this);
						itemValor.setValorDiaria(String.valueOf(rate.getTotal().getAmountAfterTax().doubleValue()));
						this.getReservaItensValor().add(itemValor);

						valorTotalLocal = valorTotalLocal + rate.getTotal().getAmountAfterTax().doubleValue();
					}
				}
			}
		}
		this.valorTotal = String.valueOf(valorTotalLocal);
		
		
		
		
	}

	/** NOVA XS */
	public ReservaItem(Rate rate, long qtdAdultos, long qtdCrianca, String roomCode, List<Payment> payments) {

		this.setCodigoHotel("-");
		this.setIndexApto(roomCode);
		this.setTipoApto(roomCode);
		this.setQtdApto("-");
		double valorTotalLocal = 0D;

		this.setFumante(1);

		this.setQtdAdultos(String.valueOf(qtdAdultos));
		this.setQtdCriancas(String.valueOf(qtdCrianca));
		this.setCode(roomCode);
		this.tipoPensao = rate.getRateMealType();

		for (RateValue rateValue : rate.getRateValues()) {
			if (rateValue.getAmount() != null) {

				ReservaItemValor itemValor = new ReservaItemValor();
				Date dataDiaria = null;
				try {
					dataDiaria = DateUtils.getInstance().criaDataComString(rateValue.getEffectiveDate(), "yyyy-MM-dd");
				} catch (ValidacaoCampoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				itemValor.setDataDiaria(dataDiaria);
				itemValor.setReservaItem(this);
				itemValor.setValorDiaria(String.valueOf(rateValue.getAmount().doubleValue()));
				this.getReservaItensValor().add(itemValor);

				valorTotalLocal = valorTotalLocal + rateValue.getAmount().doubleValue();

			}
		}

		this.valorTotal = String.valueOf(valorTotalLocal);

		// Payments
		if (payments != null) {
			
			int idPagamento = 0;
			
			for (Payment payment : payments) {

				if (idPagamento != payment.getPaymentId()) {

					List<Method> methods = payment.getMethods();

					for (Method method : methods) {

						if (method.getValue() != null) {

							ReservaItemLancamento itemValor = new ReservaItemLancamento();
							Date dataLancamento = null;
							try {
								dataLancamento = DateUtils.getInstance().criaDataComString(method.getCreated(),
										"yyyy-MM-dd'T'HH:mm:ss");
							} catch (ValidacaoCampoException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							itemValor.setDataLancamento(dataLancamento);
							itemValor.setReservaItem(this);
							itemValor.setValorLancamento(method.getValue());
							itemValor.setCodigoExternoLancamento(method.getType());
							itemValor.setCodigoNsu(method.getNSU());
							itemValor.setTransacao(method.getTransaction());
							itemValor.setDocumento(method.getDocument());

							this.getReservaItensLancamento().add(itemValor);
						}
					}
					idPagamento = payment.getPaymentId();
				}
			}
		}

	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Integer getFumante() {
		return fumante;
	}

	public void setFumante(Integer fumante) {
		this.fumante = fumante;
	}

	public List<ReservaItemValor> getReservaItensValor() {
		if (reservaItensValor == null) {
			reservaItensValor = new ArrayList<ReservaItemValor>();
		}

		return reservaItensValor;
	}

	public void setReservaItensValor(List<ReservaItemValor> reservaItensValor) {
		this.reservaItensValor = reservaItensValor;
	}

	public String getIdReservaPms() {
		return idReservaPms;
	}

	public void setIdReservaPms(String idReservaPms) {
		this.idReservaPms = idReservaPms;
	}

	public String getNumeroReservaPms() {
		return numeroReservaPms;
	}

	public void setNumeroReservaPms(String numeroReservaPms) {
		this.numeroReservaPms = numeroReservaPms;
	}

	public Double getMarkUp() {
		return markUp;
	}

	public void setMarkUp(Double markUp) {
		this.markUp = markUp;
	}

	public String getTipoPensao() {
		return tipoPensao;
	}

	public void setTipoPensao(String tipoPensao) {
		this.tipoPensao = tipoPensao;
	}

	public List<ReservaItemLancamento> getReservaItensLancamento() {
		if (reservaItensLancamento == null) {
			reservaItensLancamento = new ArrayList<ReservaItemLancamento>();
		}

		return reservaItensLancamento;
	}

	public void setReservaItensLancamento(List<ReservaItemLancamento> reservaItensLancamento) {
		this.reservaItensLancamento = reservaItensLancamento;
	}

	public Double getIss() {
		return iss;
	}

	public void setIss(Double iss) {
		this.iss = iss;
	}
}
