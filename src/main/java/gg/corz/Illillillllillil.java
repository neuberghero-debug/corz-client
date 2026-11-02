package gg.corz;

import java.util.Objects;

public record Illillillllillil(
   ilillillIiillill owner, long missionId, llIlIIllilIlIIll purpose, long destination, Long associatedTarget, int missionExpectedValue, iIllilllIlllilll scope
) {
   private final Long ilIllIIlil;
   private final int IiIllIIlil;
   private final ilillillIiillill lIIllIIlil;
   private final iIllilllIlllilll liIllIIlil;
   private final long llIllIIlil;
   private final long iIIllIIlil;
   private final llIlIIllilIlIIll IlIllIIlil;

   public Long IiIlliIliiIl() {
      return this.ilIllIIlil;
   }

   public ilillillIiillill lIiiIiIlilli() {
      return this.lIIllIIlil;
   }

   public boolean liiiIIllIl() {
      return this.ilIllIIlil != null
         && (this.IlIllIIlil == llIlIIllilIlIIll.IIiiiiIlll || this.IlIllIIlil == llIlIIllilIlIIll.liiiiiIlll || this.IlIllIIlil == llIlIIllilIlIIll.iIiiiiIlll);
   }

   public String IilliliilIIi() {
      return Iilllilliill<"Iilllilliill","sRjGdILh3Tld5X37dY5mdBN+BwztLRIls5EVpa5xkhi1JhRM2abk2aOv">()
         + this.lIIllIIlil
         + Iilllilliill<"Iilllilliill","2YEM1T7Ve/cU8SLhMYeWkPAXr48WMjjE54T+DzAkp/Uu2Nsqz/toMQCozJvG">()
         + this.IlIllIIlil
         + Iilllilliill<"Iilllilliill","CPMG1PDVV4J7d1//ZTVlDkUqyZHK9P96g/sDc+hI/HH/x23Wzr6BPh5dEbUcg7o=">()
         + this.iIIllIIlil
         + Iilllilliill<"Iilllilliill","b27N/X95NPCwKLfQr7qzbpp6ZoIMke+KeWte/ENdzqbmWmRNodvRx14=">()
         + this.llIllIIlil
         + Iilllilliill<"Iilllilliill","pJb6YEe1Ufr2OVEdXAaSv42djD8o9rUSravxUASxAPcTXFxDVotItQbMZvTyAw==">()
         + this.ilIllIIlil
         + Iilllilliill<"Iilllilliill","QTwhaOE4+DpvtLJ8lCp3Zgrn+SXhjyR4tOUTcIOD86IZ/Suy52UnIi1qLgm1sjEOJiM=">()
         + this.IiIllIIlil
         + Iilllilliill<"Iilllilliill","0yBQjXnDcTrej0ojvWDX2fwzukqit8p8RB6Zd+s0QBhS3js=">()
         + this.liIllIIlil;
   }

   public int IIlllIlliIll() {
      return this.IiIllIIlil;
   }

   public iIllilllIlllilll Illlllllilll() {
      return this.liIllIIlil;
   }

   public lIIiIIiiIIiIIi iIlIlllllill() {
      if (this.liiiIIllIl()) {
         return lIIiIIiiIIiIIi.iiIIiiiliIIlIiiili;
      } else {
         return switch (this.IlIllIIlil) {
            case lIiiiiIlll -> lIIiIIiiIIiIIi.llIIiiiliilIIiiili;
            default -> lIIiIIiiIIiIIi.IiIIiiililiIIiiili;
            case IIIIIIllll -> lIIiIIiiIIiIIi.IIIIiiililIIIiiili;
            case IiiiiiIlll -> lIIiIIiiIIiIIi.iIIIiiiliIlIIiiili;
         };
      }
   }

   public long IlIlllIlilIl() {
      return this.llIllIIlil;
   }

   public long iliIiiliiiii() {
      return this.iIIllIIlil;
   }

   public Illillillllillil(
      ilillillIiillill owner,
      long missionId,
      llIlIIllilIlIIll purpose,
      long destination,
      Long associatedTarget,
      int missionExpectedValue,
      iIllilllIlllilll scope
   ) {
      Objects.requireNonNull(owner);
      Objects.requireNonNull(purpose);
      missionExpectedValue = Math.max(0, missionExpectedValue);
      this.lIIllIIlil = owner;
      this.iIIllIIlil = missionId;
      this.IlIllIIlil = purpose;
      this.llIllIIlil = destination;
      this.ilIllIIlil = associatedTarget;
      this.IiIllIIlil = missionExpectedValue;
      this.liIllIIlil = scope;
   }

   public boolean IliIlllilIi() {
      return this.liIllIIlil == iIllilllIlllilll.iiiilIlill;
   }

   public llIlIIllilIlIIll IIIllIIliIIl() {
      return this.IlIllIIlil;
   }
}
