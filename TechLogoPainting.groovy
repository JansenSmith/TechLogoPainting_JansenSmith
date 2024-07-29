// code here

// import logo STL
File logoSTL = ScriptingEngine.fileFromGit(
	"https://github.com/JansenSmith/Technocopia_logo_chalk_Front_200x242_JansenSmith.git",
	"Technocopia_logo_chalk_Front_200x242.stl");
// Load the .CSG from the disk and cache it in memory
CSG logo  = Vitamins.get(logoSTL);
logo = logo.toZMin()