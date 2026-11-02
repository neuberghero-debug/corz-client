package gg.corz;

public sealed interface IlllIillllIi<P> permits illlIiIillIi, iiliIIIiIIiiIIIi, lIlIIlIiiIlIIlIi {
   static <P> IlllIillllIi<P> iIlIlllllill(P observed, llIiiIililIiiIil chainProven, int provenMember, boolean plan, String why) {
      return new iiliIIIiIIiiIIIi<>((P)observed, chainProven, provenMember, plan, why);
   }

   default boolean lIiiIiIlilli() {
      return !(this instanceof lIlIIlIiiIlIIlIi);
   }

   boolean IliIlllilIi();

   default String IIlllIlliIll() {
      if (this instanceof illlIiIillIi) {
         return "ADMITTED";
      } else {
         return this instanceof iiliIIIiIIiiIIIi ? "NOT_PROVEN" : "REJECTED";
      }
   }

   default boolean iliIiiliiiii() {
      return this instanceof illlIiIillIi;
   }

   static <P> IlllIillllIi<P> liiiIIllIl(P plan, int chainProven, boolean provenMember) {
      return new illlIiIillIi<>((P)plan, chainProven, provenMember);
   }

   default P IIIllIIliIIl() {
      if (this instanceof illlIiIillIi var3) {
         return (P)var3.IIIllIIliIIl();
      } else {
         return (P)(this instanceof iiliIIIiIIiiIIIi var1 ? var1.IIIllIIliIIl() : null);
      }
   }

   default llIiiIililIiiIil IlIlllIlilIl() {
      if (this instanceof lIlIIlIiiIlIIlIi var3) {
         return var3.IlIlllIlilIl();
      } else {
         return this instanceof iiliIIIiIIiiIIIi var1 ? var1.Iilllilliill() : llIiiIililIiiIil.iilIlilIil;
      }
   }

   default String Illlllllilll(String kind, int members) {
      StringBuilder var3 = new StringBuilder("kind=")
         .append(kind)
         .append(" members=")
         .append(members)
         .append(" result=")
         .append(this.IIlllIlliIll())
         .append(" reason=")
         .append(this.IlIlllIlilIl())
         .append(" provenDirectionalMember=")
         .append(this.IiIlliIliiIl())
         .append(" dependencyChainProven=")
         .append(this.IliIlllilIi());
      if (this instanceof iiliIIIiIIiiIIIi var4) {
         var3.append(" unprovenBecause=").append(var4.Ililllililil());
      }

      return var3.toString();
   }

   default int IiIlliIliiIl() {
      if (this instanceof illlIiIillIi var3) {
         return var3.Iilllilliill();
      } else {
         return this instanceof iiliIIIiIIiiIIIi var1 ? var1.IIillIiliIil() : ((lIlIIlIiiIlIIlIi)this).Iilllilliill();
      }
   }

   static <P> IlllIillllIi<P> IilliliilIIi(llIiiIililIiiIil chainProven, int provenMember, boolean reason) {
      return new lIlIIlIiiIlIIlIi<>(chainProven, provenMember, reason);
   }
}
