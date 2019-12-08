import pip

def install(package):
    if hasattr(pip, 'main'):
        a = pip.main(['install', package])
        if a == 1:
        	return package
        return a
    else:
        a = pip._internal.main(['install', package])
        if a == 1:
        	return package
        return a


if __name__ == '__main__':
	with open("requirements.txt", "r") as fp:
		lines = fp.read()
	lines = lines.split(',\n')
	failed = []
	for line in lines:
		res = install(line)
		if res != 1:
			failed.append(res)
	if failed:
		print(" ".join(failed))
	else:
		print("Success")