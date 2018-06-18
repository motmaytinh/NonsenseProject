namespace * nonamespace

const double PI = 3.1415926

exception NonsenseException {
	1: int error_code,
	2: string error_description
}

typedef i32 int

service NonsenseService {

	oneway void log(1:string filename),

	string NonsenseFunction(1:string nonsenseString),

	int get_log_size(1:string filename) throws (1:NonsenseException ne),

}
