package gg.corz;

public record IIliIIilIliIIi(long from, long to, iiiIIiilIIIlIiil transition, IIlIliIllIlIliIl mode) {
   private final iiiIIiilIIIlIiil liiliiiliiiiliiili;
   private final long Ililiiililliliiili;
   private final IIlIliIllIlIliIl IIIiiiililIIiiiili;
   private final long ililiiiliIiiliiili;

   public IIlIliIllIlIliIl IilliliilIIi() {
      return this.IIIiiiililIIiiiili;
   }

   public long liiiIIllIl() {
      return this.ililiiiliIiiliiili;
   }

   public long IliIlllilIi() {
      return this.Ililiiililliliiili;
   }

   public IIliIIilIliIIi(long from, long to, iiiIIiilIIIlIiil transition, IIlIliIllIlIliIl mode) {
      this.Ililiiililliliiili = from;
      this.ililiiiliIiiliiili = to;
      this.liiliiiliiiiliiili = transition;
      this.IIIiiiililIIiiiili = mode;
   }

   public iiiIIiilIIIlIiil iIlIlllllill() {
      return this.liiliiiliiiiliiili;
   }
}
