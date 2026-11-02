package gg.corz;

public record ilililiIiilili(long maxUnitPrice, IiIiIliliIiIli reason, long spendingLimit, long lastPaid, double jump) {
   private final double ilIllIlIIl;
   private final long lIIllIlIIl;
   private final long llIllIlIIl;
   private final long IlIllIlIIl;
   private final IiIiIliliIiIli iIIllIlIIl;

   public IiIiIliliIiIli lIiiIiIlilli() {
      return this.iIIllIlIIl;
   }

   public long IilliliilIIi() {
      return this.lIIllIlIIl;
   }

   public boolean IliIlllilIi() {
      return this.lIIllIlIIl > 0L;
   }

   public long IIIllIIliIIl() {
      return this.llIllIlIIl;
   }

   public String iIlIlllllill() {
      return switch (this.iIIllIlIIl) {
         case liliIlIIIl -> IiIlliIliiIl<"IiIlliIliiIl","CdwrnicTPCCK7V7lC47rD6WZFtzrmuGh79t1fj9jK7hq7s0u">();
         case IiliIlIIIl -> IiIlliIliiIl<"IiIlliIliiIl","4JUSMotLxfnOke2lvHzqYsxn8FhNtaoeWiKTCxvMPhqA+pBDdUyGT9sFu9whg2IIWUL1l5mQag==">()
         + llIIilIiilIIilIi.liiiIIllIl(this.lIIllIlIIl)
         + IiIlliIliiIl<"IiIlliIliiIl","KygYO2//fDwSMhuMUn2lvTf0BArdWrpn91H525b2Y4DevbMsZg==">();
         case iiliIlIIIl -> IiIlliIliiIl<"IiIlliIliiIl","lOIiQxZRkhGgM1SveowLY7hjkxfLDukvGcRnQ2EYX0JlT9tjnVc=">()
         + lllIillillIill.iliIiiliiiii(this.ilIllIlIIl)
         + IiIlliIliiIl<"IiIlliIliiIl","O/dbeCAFUrarnwz6u9jlN5ZmqxQzYcK1gkrJHhSXijVTWA==">()
         + llIIilIiilIIilIi.liiiIIllIl(this.llIllIlIIl)
         + IiIlliIliiIl<"IiIlliIliiIl","iArdqduzH+DrNEU8gL5lLUGmCVjNmgJppbwF5sppbECdos1v/5QpqB4T9xMtTQAZ">()
         + llIIilIiilIIilIi.liiiIIllIl(this.lIIllIlIIl)
         + IiIlliIliiIl<"IiIlliIliiIl","5tjNXlPZIWcgaEepb1ztoXUWCMehZiY+k1QNPcGDBt07J/XYnho=">();
      };
   }

   public double IlIlllIlilIl() {
      return this.ilIllIlIIl;
   }

   public ilililiIiilili(long maxUnitPrice, IiIiIliliIiIli reason, long spendingLimit, long lastPaid, double jump) {
      this.lIIllIlIIl = maxUnitPrice;
      this.iIIllIlIIl = reason;
      this.IlIllIlIIl = spendingLimit;
      this.llIllIlIIl = lastPaid;
      this.ilIllIlIIl = jump;
   }

   public long iliIiiliiiii() {
      return this.IlIllIlIIl;
   }

   public boolean liiiIIllIl(long unitPrice) {
      return this.lIIllIlIIl <= 0L || unitPrice <= this.lIIllIlIIl;
   }
}
