package site.ownw.micro.house.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author sofior
 * @date 2019/3/5 10:23
 */
@Data
public class ComputeRequest {

    /**
     * 首付支付日期
     */
    @NotNull
    private LocalDate downPaymentDate;
    /**
     * 首次还款日
     */
    @NotNull
    private LocalDate firstRepaymentDate;
    /**
     * 每月还款日
     */
    @NotNull
    private Integer payDay;
    /**
     * 首付金额
     */
    @NotNull
    private BigDecimal downPayment;
    /**
     * 月供
     */
    @NotNull
    private BigDecimal monthlyPayment;
    /**
     * 总贷款期数
     */
    @NotNull
    private Integer totalPeriods;
    /**
     * 自行运营年利率
     */
    @NotNull
    private BigDecimal operateRate;
    /**
     * 贷款利率
     */
    @NotNull
    private BigDecimal loanRate;
}
