create table if not exists routing_policy(
route_id Integer not null,
manual_routing varchar(255) null,
automated_route char null,
route_table_id Integer null,
route_table_name varchar(255) null,
simple_policy varchar(255) null,
weighted_policy varchar(255) null,
latency_policy varchar(255) null,
fail_over varchar(255) null,
geo_location Integer null,
geo_proximity varchar(255) null,
ip_based varchar(255) null,
multi_value varchar(255) null,
constraint routing_policy_pk primary key(route_id));