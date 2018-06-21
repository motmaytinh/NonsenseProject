namespace * nonsenseproject

const double PI = 3.1415926

typedef i32 int

enum filetype {
	TXT,
	PDF,
	WORD
}

struct file {
	1: string name,
	2: filetype type,
	3: binary buf
}

exception NonsenseException {
	1: int error_code,
	2: string error_description
}

struct returnval {
	1: int error_code
	2: string error_description
}

struct answer {
	1: int error_code
	2: string error_description
	3: string answer
}

service NonsenseService {

	oneway void log(1:string filename),

	returnval upload(1: file filename),

	answer ask(1:string question),

	oneway void endsession()

	//string NonsenseFunction(1:string nonsenseString) throws (1:NonsenseException ne),
}
