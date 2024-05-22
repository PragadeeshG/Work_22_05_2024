create table if not exists webservices_route_dns(
route_name varchar(255) not null,
rooute_id varchar(255) null,
source_ip varchar(255) null,
route_entry_type varchar(255) null,
health_check_status varchar(255) null,
aws_resource_id varchar(255) null,
aws_resource_name varchar(255) null,
public_subnet varchar(255) null,
private_subnet varchar(255) null,
status varchar(255) null,
constraint webservices_route_dns_pk primary key(route_name));