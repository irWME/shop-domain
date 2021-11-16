package nl.simpliphi.shopdomain.customer;

import com.github.easysourcing.messages.annotations.AggregateId;
import com.github.easysourcing.messages.annotations.TopicInfo;
import lombok.Builder;
import lombok.Value;

@TopicInfo("customer-events")
public interface CustomerEvent {

  @Value
  @Builder
  class CustomerCreated implements CustomerEvent {
    @AggregateId
    String customerId;
    String firstName;
    String lastName;
  }

  @Value
  @Builder
  class FirstNameChanged implements CustomerEvent {
    @AggregateId
    String customerId;
    String firstName;
  }
}
