package nl.simpliphi.shopdomain.customer;

import com.github.easysourcing.messages.annotations.AggregateId;
import com.github.easysourcing.messages.annotations.TopicInfo;
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
