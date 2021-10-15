package nl.simpliphi.shopdomain.customer;

import io.github.alikelleci.easysourcing.common.annotations.AggregateId;
import io.github.alikelleci.easysourcing.common.annotations.TopicInfo;
import lombok.Builder;
import lombok.Value;

@TopicInfo("customer-commands")
public interface CustomerCommand {

  @Value
  @Builder
  class CreateCustomer implements CustomerCommand {
    @AggregateId
    String customerId;
    String firstName;
    String lastName;
  }

  @Value
  @Builder
  class ChangeFirstName implements CustomerCommand {
    @AggregateId
    String customerId;
    String firstName;
  }
}
