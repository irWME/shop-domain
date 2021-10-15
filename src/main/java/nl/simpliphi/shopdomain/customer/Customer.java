package nl.simpliphi.shopdomain.customer;

import io.github.alikelleci.easysourcing.common.annotations.AggregateId;
import io.github.alikelleci.easysourcing.common.annotations.TopicInfo;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@TopicInfo("customer-snapshots")
public class Customer {
  @AggregateId
  private String id;
  private String firstName;
  private String lastName;
  private String address;
}
