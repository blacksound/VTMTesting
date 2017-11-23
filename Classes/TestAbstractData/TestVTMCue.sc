TestVTMCue : TestVTMAbstractData {

	*makeRandomAttribute{arg key, params;
		var result;
		result = super.makeRandomAttribute(key, params);
		result = switch(key,
			\preDelay, {rrand(0.0, 10.0)},
			\duration, {rrand(0.0, 10.0)},
			\postDelay, {rrand(0.0, 10.0)},
			\hangBeforeStart, {0.5.coin},
			\maxStartHangTime, {rrand(0.0, 10.0)},
			\hangBeforeEnd, {0.5.coin},
			\maxEndHangTime, {rrand(0.0, 10.0)},
			\pointOrder, {
				[\normal, \random, \reverse].choose;//TODO: add order array possibility
			},
			\hangBetweenPoints, {0.5.coin},
			\delayBetweenPoints, {rrand(0.0, 10.0)}
		);
		^result;
	}
}
