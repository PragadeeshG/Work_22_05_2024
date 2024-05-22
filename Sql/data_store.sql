create table if not exists data_store(
store_id Integer not null,
store_name varchar(255) null,
store_type varchar(255) null,
total_buckets varchar(255) null,
bucket_policy Integer null,
static_website Integer null,
version Integer null,
replication varchar(255) null,
frequent_access varchar(255) null,
in_frequent_access varchar(255) null,
glacier varchar(255) null,
status varchar(255) null,
constraint data_store_pk primary key(store_id));