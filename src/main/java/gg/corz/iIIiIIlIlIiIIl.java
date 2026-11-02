package gg.corz;

record iIIiIIlIlIiIIl(String title, String artist, String lyricKey, int durationSec, long baseElapsedMs, long stateMs, boolean playing) {
   private final long IliIiliIllliIiliIl;
   private final int lIiIiliIliIiIiliIl;
   private final String IilIiliIllilIiliIl;
   private final long iliIiliIlIiiIiliIl;
   private final String lllIiliIlillIiliIl;
   private final boolean liiIiliIliiiIiliIl;
   private final String iilIiliIlIIiIiliIl;

   public int lIiiIiIlilli() {
      return this.lIiIiliIliIiIiliIl;
   }

   public long iliIiiliiiii() {
      return this.IliIiliIllliIiliIl;
   }

   public String iIlIlllllill() {
      return this.IilIiliIllilIiliIl;
   }

   public String liiiIIllIl() {
      return this.lllIiliIlillIiliIl;
   }

   public long IIIllIIliIIl() {
      return this.iliIiliIlIiiIiliIl;
   }

   private iIIiIIlIlIiIIl(String title, String artist, String lyricKey, int durationSec, long baseElapsedMs, long stateMs, boolean playing) {
      this.lllIiliIlillIiliIl = title;
      this.IilIiliIllilIiliIl = artist;
      this.iilIiliIlIIiIiliIl = lyricKey;
      this.lIiIiliIliIiIiliIl = durationSec;
      this.IliIiliIllliIiliIl = baseElapsedMs;
      this.iliIiliIlIiiIiliIl = stateMs;
      this.liiIiliIliiiIiliIl = playing;
   }

   long IliIlllilIi(long now) {
      long var3 = this.IliIiliIllliIiliIl;
      if (this.liiIiliIliiiIiliIl) {
         var3 += now - this.iliIiliIlIiiIiliIl;
      }

      return var3 < (4978556243643199062L ^ 4978556243643199062L)
         ? 0L
         : Math.min(var3, (long)this.lIiIiliIliIiIiliIl * (-7721836264110468577L ^ -7721836264110468617L));
   }

   public boolean IlIlllIlilIl() {
      return this.liiIiliIliiiIiliIl;
   }

   public String IilliliilIIi() {
      return this.iilIiliIlIIiIiliIl;
   }
}
