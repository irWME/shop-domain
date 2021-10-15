package nl.simpliphi.shopdomain.customer;

import io.github.alikelleci.easysourcing.common.annotations.AggregateId;
import io.github.alikelleci.easysourcing.common.annotations.TopicInfo;
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
