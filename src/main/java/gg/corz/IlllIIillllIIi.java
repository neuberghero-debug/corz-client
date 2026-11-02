package gg.corz;

public record IlllIIillllIIi(iIliIiIiIlliIiIi state, iIliIiIiIlliIiIi previous, boolean episodeStarted, boolean episodeEnded, String reason) {
   private final boolean llIiIiiliilIiIiili;
   private final iIliIiIiIlliIiIi iIIiIiiliIlIiIiili;
   private final iIliIiIiIlliIiIi IIIiIiililIIiIiili;
   private final String iiIiIiiliIIliIiili;
   private final boolean IiIiIiililiIiIiili;

   public IlllIIillllIIi(iIliIiIiIlliIiIi state, iIliIiIiIlliIiIi previous, boolean episodeStarted, boolean episodeEnded, String reason) {
      this.IIIiIiililIIiIiili = state;
      this.iIIiIiiliIlIiIiili = previous;
      this.llIiIiiliilIiIiili = episodeStarted;
      this.IiIiIiililiIiIiili = episodeEnded;
      this.iiIiIiiliIIliIiili = reason;
   }

   public boolean IilliliilIIi() {
      return this.IiIiIiililiIiIiili;
   }

   public boolean iIlIlllllill() {
      return this.llIiIiiliilIiIiili;
   }

   public iIliIiIiIlliIiIi IliIlllilIi() {
      return this.IIIiIiililIIiIiili;
   }

   public String lIiiIiIlilli() {
      return this.iiIiIiiliIIliIiili;
   }

   public iIliIiIiIlliIiIi liiiIIllIl() {
      return this.iIIiIiiliIlIiIiili;
   }
}
