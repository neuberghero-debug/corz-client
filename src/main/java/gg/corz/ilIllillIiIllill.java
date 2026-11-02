package gg.corz;

import java.util.Objects;

public final class ilIllillIiIllill<P> {
   public final P IliiIIiill;
   public final long iiliIIiill;
   public final ilillillIiillill liliIIiill;
   public final lIIiIIiiIIiIIi IiliIIiill;
   private String iliiIIiill;
   public final long iIiiIIiill;
   public final long lIiiIIiill;
   private Iiilillliilill lliiIIiill;
   public final long IIiiIIiill;

   public void IiIlliIliiIl(Iiilillliilill next) {
      if (!this.liiiIIllIl() || !this.IIIllIIliIIl()) {
         throw new IllegalStateException(IIillIiliIil<"IIillIiliIil","Rpzn1dxVDho010NEzji3zJQ0j+K/hrn2iy0vv4mWy+jiS2T3kgxEcj27M/mevfpbNSquWsgljQ==">());
      } else if (next != Iiilillliilill.liiilIlIiiiiilIlIi && next != Iiilillliilill.IIIIiIlIilIIIiIlIi && next != Iiilillliilill.iIIIiIlIiIlIIiIlIi) {
         throw new IllegalArgumentException(IIillIiliIil<"IIillIiliIil","5uypYuQwNV4yz8nlvu/dTn6xfJ5fIR32kgs3sjS2OL8dGUiFlEfE0md/lxUuB5D9Vm5VPQ==">() + next);
      } else if (this.lliiIIiill == Iiilillliilill.IliilIlIilliilIlIi) {
         throw new IllegalStateException(IIillIiliIil<"IIillIiliIil","YGmOamy3bsM8EYS0o9qVQRTjdiHlC6jErkHZ9cyx3MDPfduIi5uXdDIWV4Ve">());
      } else {
         this.lliiIIiill = next;
      }
   }

   public boolean liiiIIllIl() {
      return this.IiliIIiill == lIIiIIiiIIiIIi.iiIIiiiliIIlIiiili || this.IiliIIiill == lIIiIIiiIIiIIi.lIlIiiiliiIlIiiili;
   }

   public boolean IIIllIIliIIl() {
      return this.lliiIIiill != Iiilillliilill.llIIiIlIiilIIiIlIi && this.lliiIIiill != Iiilillliilill.IiIIiIlIiliIIiIlIi;
   }

   private ilIllillIiIllill(ilillillIiillill type, long stand, lIIiIIiiIIiIIi owner, long proof, long move, long revision, P missionId, boolean target) {
      this.IiliIIiill = Objects.requireNonNull(owner);
      this.liliIIiill = Objects.requireNonNull(type);
      this.iiliIIiill = stand;
      this.IIiiIIiill = proof;
      this.lIiiIIiill = move;
      this.iIiiIIiill = revision;
      this.IliiIIiill = (P)(this.liiiIIllIl() ? Objects.requireNonNull((P)missionId) : missionId);
      this.lliiIIiill = target ? Iiilillliilill.IliilIlIilliilIlIi : Iiilillliilill.iliilIlIiIiiilIlIi;
   }

   public boolean Iilllilliill(long feet, long cell) {
      return this.liiiIIllIl() && this.IIIllIIliIIl() && this.IIiiIIiill == feet && this.lIiiIIiill == cell;
   }

   public static <P> ilIllillIiIllill<P> IliIlllilIi(Illillillllillil revision, long intent) {
      if (revision.liiiIIllIl()) {
         throw new IllegalArgumentException(IIillIiliIil<"IIillIiliIil","iN6Yxxq0gBxfOpQLeILff2tSvIyDoWyNE1Kktzeo8TYFpvqwe4LRb46kl0qrQA1ewWmIi3yFCe2W">());
      } else {
         return new ilIllillIiIllill<>(
            revision.lIiiIiIlilli(), revision.iliIiiliiiii(), revision.iIlIlllllill(), 0L, revision.IlIlllIlilIl(), intent, null, true
         );
      }
   }

   public boolean IilliliilIIi(long feet) {
      if (!this.liiiIIllIl() && this.IIIllIIliIIl() && feet == this.lIiiIIiill) {
         this.lliiIIiill = Iiilillliilill.llIIiIlIiilIIiIlIi;
         return true;
      } else {
         return false;
      }
   }

   public Iiilillliilill lIiiIiIlilli() {
      return this.lliiIIiill;
   }

   public void Illlllllilll(String why) {
      if (why == null || why.isBlank()) {
         throw new IllegalArgumentException(IIillIiliIil<"IIillIiliIil","7vsS2X5NxFyKsdN9fpUWwodZgwG22wxusxHEPMKsJUJV1p9deKJmxQ22VZzcvQgdX2eG5Q==">());
      } else if (this.IIIllIIliIIl()) {
         this.iliiIIiill = why;
         this.lliiIIiill = Iiilillliilill.IiIIiIlIiliIIiIlIi;
      }
   }

   public boolean IlIlllIlilIl(long feet) {
      if (this.IIIllIIliIIl() && feet == this.lIiiIIiill) {
         if (this.lliiIIiill == Iiilillliilill.IliilIlIilliilIlIi) {
            this.lliiIIiill = Iiilillliilill.iliilIlIiIiiilIlIi;
         }

         return true;
      } else {
         return false;
      }
   }

   public Long iIlIlllllill() {
      return this.liiiIIllIl() ? this.IIiiIIiill : null;
   }

   public String iliIiiliiiii() {
      return this.iliiIIiill;
   }

   public ilIllillIiIllill(ilillillIiillill revision, long move, long stand, long owner, long missionId, P proof, boolean target) {
      this(revision, move, target ? lIIiIIiiIIiIIi.iiIIiiiliIIlIiiili : lIIiIIiiIIiIIi.lIlIiiiliiIlIiiili, stand, owner, missionId, (P)proof, target);
   }

   public boolean IIlllIlliIll(long cell) {
      if (this.liiiIIllIl() && this.IIIllIIliIIl() && this.IIiiIIiill == cell) {
         this.lliiIIiill = Iiilillliilill.llIIiIlIiilIIiIlIi;
         return true;
      } else {
         return false;
      }
   }
}
