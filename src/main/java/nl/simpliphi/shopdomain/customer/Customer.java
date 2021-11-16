package nl.simpliphi.shopdomain.customer;

import com.github.easysourcing.messages.annotations.AggregateId;
import com.github.easysourcing.messages.annotations.TopicInfo;
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
