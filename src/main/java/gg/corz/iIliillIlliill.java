package gg.corz;

public record iIliillIlliill(
   iIilIIllIlilIIll status,
   lilllIIliilllIIl reason,
   long target,
   long stand,
   IIlIiiIilIlIiiIi eye,
   boolean sneak,
   lIlIIiiliIlIIiil hit,
   iilliIilIIiliIil interval,
   double requiredOffset,
   double safeLimit
) {
   private final IIlIiiIilIlIiiIi iiliIllIiIIiiIllIi;
   private final lilllIIliilllIIl iIliIllIiIlliIllIi;
   private final iIilIIllIlilIIll IIliIllIilIliIllIi;
   private final double liiiIllIiiiiiIllIi;
   private final long IiliIllIililiIllIi;
   private final lIlIIiiliIlIIiil IliiIllIilliiIllIi;
   private final double IIIIlllIilIIIlllIi;
   private final iilliIilIIiliIil iliiIllIiIiiiIllIi;
   private final boolean lIiiIllIiiIiiIllIi;
   private final long llliIllIiilliIllIi;

   public boolean liiiIIllIl() {
      return this.IIliIllIilIliIllIi != iIilIIllIlilIIll.iilIlIllll;
   }

   public String IIIllIIliIIl() {
      return switch (this.IIliIllIilIliIllIi) {
         case lilIlIllll -> IiIiliIiiiIi<"IiIiliIiiiIi","WLbOrZ/tN2YxdovTDQQ9WTCgCSm1cJRUFkjaq91dxA==">();
         case iilIlIllll -> IiIiliIiiiIi<"IiIiliIiiiIi","7yboNVZZxVvciOh8CkKmYTQUzCcRV1o7mIS7//LD2VYKag==">();
         case IilIlIllll -> IiIiliIiiiIi<"IiIiliIiiiIi","wtS/QZ/WQb+fqi0m+jKXOK0xL4DTN3NheCwNdYlxeR0=">();
         case illIlIllll -> IiIiliIiiiIi<"IiIiliIiiiIi","EmWaCVw0MqZD7YSDH8KnQ/O1JDA4bND7ythh3UG6dW1lWOUt">() + this.iIliIllIiIlliIllIi;
      };
   }

   public boolean IIillIiliIil() {
      return this.lIiiIllIiiIiiIllIi;
   }

   public long IIlllIlliIll() {
      return this.llliIllIiilliIllIi;
   }

   public static iIliillIlliill lIiiIiIlilli(long reason, long target, lilllIIliilllIIl stand) {
      return new iIliillIlliill(iIilIIllIlilIIll.iilIlIllll, stand, reason, target, IIlIiiIilIlIiiIi.lllIiiiIIi, false, null, null, 0.0, 0.29000000000000004);
   }

   public IIlIiiIilIlIiiIi Iilllilliill() {
      return this.iiliIllIiIIiiIllIi;
   }

   public boolean iIlIlllllill() {
      return this.IIliIllIilIliIllIi == iIilIIllIlilIIll.IilIlIllll;
   }

   public iilliIilIIiliIil Iiilliiliiil() {
      return this.iliiIllIiIiiiIllIi;
   }

   public boolean IliIlllilIi() {
      return this.IIliIllIilIliIllIi == iIilIIllIlilIIll.illIlIllll || this.IIliIllIilIliIllIi == iIilIIllIlilIIll.IilIlIllll;
   }

   public iIilIIllIlilIIll IlIlllIlilIl() {
      return this.IIliIllIilIliIllIi;
   }

   public double IIIilIIiiIIi() {
      return this.liiiIllIiiiiiIllIi;
   }

   public lIlIIiiliIlIIiil Ililllililil() {
      return this.IliiIllIilliiIllIi;
   }

   public boolean IilliliilIIi() {
      return this.IIliIllIilIliIllIi == iIilIIllIlilIIll.iilIlIllll
         && (
            this.iIliIllIiIlliIllIi == lilllIIliilllIIl.illliillIl
               || this.iIliIllIiIlliIllIi == lilllIIliilllIIl.IilliillIl
               || this.iIliIllIiIlliIllIi == lilllIIliilllIIl.iilliillIl
         );
   }

   public iIliillIlliill(
      iIilIIllIlilIIll status,
      lilllIIliilllIIl reason,
      long target,
      long stand,
      IIlIiiIilIlIiiIi eye,
      boolean sneak,
      lIlIIiiliIlIIiil hit,
      iilliIilIIiliIil interval,
      double requiredOffset,
      double safeLimit
   ) {
      this.IIliIllIilIliIllIi = status;
      this.iIliIllIiIlliIllIi = reason;
      this.llliIllIiilliIllIi = target;
      this.IiliIllIililiIllIi = stand;
      this.iiliIllIiIIiiIllIi = eye;
      this.lIiiIllIiiIiiIllIi = sneak;
      this.IliiIllIilliiIllIi = hit;
      this.iliiIllIiIiiiIllIi = interval;
      this.liiiIllIiiiiiIllIi = requiredOffset;
      this.IIIIlllIilIIIlllIi = safeLimit;
   }

   public double IlIillIiilIi() {
      return this.IIIIlllIilIIIlllIi;
   }

   public long Illlllllilll() {
      return this.IiliIllIililiIllIi;
   }

   public lilllIIliilllIIl IiIlliIliiIl() {
      return this.iIliIllIiIlliIllIi;
   }

   iIliillIlliill iliIiiliiiii() {
      return new iIliillIlliill(
         iIilIIllIlilIIll.lilIlIllll,
         this.iIliIllIiIlliIllIi,
         this.llliIllIiilliIllIi,
         this.IiliIllIililiIllIi,
         this.iiliIllIiIIiiIllIi,
         this.lIiiIllIiiIiiIllIi,
         this.IliiIllIilliiIllIi,
         this.iliiIllIiIiiiIllIi,
         this.liiiIllIiiiiiIllIi,
         this.IIIIlllIilIIIlllIi
      );
   }
}
