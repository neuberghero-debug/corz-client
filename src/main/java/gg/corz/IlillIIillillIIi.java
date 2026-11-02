package gg.corz;

public record IlillIIillillIIi(liIIiilliiIIiill tone, String state, String target, int pops, int popsTaken, String hint) {
   private final String illIIIiiil;
   private final int iilIIIiiil;
   private final String IilIIIiiil;
   public static final IlillIIillillIIi lIiIIIiiil = new IlillIIillillIIi(
      liIIiilliiIIiill.iiIIiliill,
      IlIlllIlilIl<"IlIlllIlilIl","laGNmY0Htg0FAm/DWcxoUkoj0rDg1ZT70ltYz3+eYg==">(),
      null,
      0,
      0,
      IlIlllIlilIl<"IlIlllIlilIl","eG2aLhoubtO2dflHvGMjvgapr3ZYO7kwzjw9g1dq7FHrW4KFFhXM1unuq10GIXx5CyBswmFVgbc6olx9VRJdSwTKXaMD">()
   );
   private final String IIiIIIiiil;
   private final int lilIIIiiil;
   private final liIIiilliiIIiill lllIIIiiil;

   public IlillIIillillIIi(liIIiilliiIIiill tone, String state, String target, int pops, int popsTaken, String hint) {
      tone = tone == null ? liIIiilliiIIiill.iiIIiliill : tone;
      state = state != null && !state.isBlank() ? state : IlIlllIlilIl<"IlIlllIlilIl","laGNmY0Htg0FAm/DWcxoUkoj0rDg1ZT70ltYz3+eYg==">();
      target = target != null && !target.isBlank() ? target : null;
      pops = Math.max(0, pops);
      popsTaken = Math.max(0, popsTaken);
      hint = hint != null && !hint.isBlank() ? hint : null;
      this.lllIIIiiil = tone;
      this.illIIIiiil = state;
      this.IilIIIiiil = target;
      this.lilIIIiiil = pops;
      this.iilIIIiiil = popsTaken;
      this.IIiIIIiiil = hint;
   }

   public String iIlIlllllill() {
      return this.illIIIiiil;
   }

   public int iliIiiliiiii() {
      return this.iilIIIiiil;
   }

   public liIIiilliiIIiill liiiIIllIl() {
      return this.lllIIIiiil;
   }

   public boolean IliIlllilIi() {
      return this.IilIIIiiil != null || this.lilIIIiiil > 0 || this.iilIIIiiil > 0;
   }

   public String IilliliilIIi() {
      return this.IilIIIiiil;
   }

   public int lIiiIiIlilli() {
      return this.lilIIIiiil;
   }

   public String IIIllIIliIIl() {
      return this.IIiIIIiiil;
   }
}
