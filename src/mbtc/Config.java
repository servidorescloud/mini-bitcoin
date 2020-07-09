package mbtc;

class K {
	// To create your own coin, change PORT, GENESIS_MSG and set START_TIME as a fixed timestamp.
	// --------------------------------------------
	static int PORT = 10770;
	static final String GENESIS_MSG = "BYGU.NET COIN MD TEAM";
	static final long START_TIME = 1577847600000L;// System.currentTimeMillis();// 1577847600000L; // 2020-01-01
	static String[] SEEDS = { "localhost" };
	// --------------------------------------------
	static final long BLOCK_TIME = 2 * 60 * 1000; // 2 minutes
	static final long REWARD = 5;
	static final int MAX_BLOCK_SIZE = 1024 * 1024; // 1 MB
	static final int MIN_BLOCK_SIZE = 1024; // Block with only coinbase tx. Im NOT sure this value.
	static final String SPEC = "secp256k1";
	static final String ALGO = "EC";
	static final long MINE_ROUND = 1 * 10000;
	static final String START_TARGET = "0000100000000000000000000000000000000000000000000000000000000000";
}
