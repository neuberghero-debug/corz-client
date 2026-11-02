package gg.corz;

import java.util.List;

public final class lIliliIiiIliliIi {
   private long lIllIiiIIi;
   private int IiIlIiiIIi;
   private int ilIlIiiIIi;
   private int liiIIiiIIi;
   private lllIiIllillIiIll IlIlIiiIIi;
   private final iiIIIIliIIlIIIli IliIIiiIIi;
   private final iIlIiIllIi iliIIiiIIi;
   private final lliiillliliiilll lliIIiiIIi;
   private int iiIlIiiIIi;
   private int llIlIiiIIi;
   private int IIllIiiIIi;
   public static final int lIiIIiiIIi = 64;
   public static final int IIiIIiiIIi = 2;
   private int iiiIIiiIIi;
   private boolean lIIlIiiIIi;
   private int IiiIIiiIIi = 12;
   private int liIlIiiIIi;
   public static final long iIiIIiiIIi = 2000000L;
   public static final int iilIIiiIIi = 12;
   private long IIIlIiiIIi;
   private int iIIlIiiIIi;

   public boolean IIlllIlliIll(int cell, long ctx, iIIiIlllIlIiIlll deckY) {
      return this.IliIIiiIIi.lIiiIiIlilli(cell, ctx, deckY) == null;
   }

   public void Ililllililil() {
      this.IliIIiiIIi.iiIIlIIlIl();
      this.lliIIiiIIi.Illlllllilll();
      this.lIIlIiiIIi = false;
      this.iIIlIiiIIi = Integer.MIN_VALUE;
      this.IlIlIiiIIi = null;
      this.llIlIiiIIi = this.ilIlIiiIIi = this.IiIlIiiIIi = this.liIlIiiIIi = this.iiIlIiiIIi = this.IIllIiiIIi = 0;
      this.lIllIiiIIi = 0L;
   }

   public long Illillliilli() {
      return this.lIllIiiIIi;
   }

   public void IilliliilIIi(int cap, Illlllllllllllll deckY) {
      if (this.lliIIiiIIi.IlIillIiilIi(cap) && !this.lliIIiiIIi.IIIilIIiiIIi()) {
         this.lliIIiiIIi
            .IiIlliIliiIl(llIIlilIIl<"llIIlilIIl","4spVFYkH/5XSaOUZTljRML9bZ87AO0Krg4zsckpyiNGlEiJlZZ+SwI6bcmHA8D1mCcjVg+w=">() + deckY.liiiIIllIl());
      }

      this.IliIIiiIIi.Iiilliiliiil(cap, deckY);
   }

   public int Iliilliiilii() {
      return this.iiIlIiiIIi;
   }

   public lliiillliliiilll IIIilIIiiIIi() {
      return this.lliIIiiIIi;
   }

   public void IliIlllilIi(int proofs, int nanos, long astar, int revalidate) {
      this.IiiIIiiIIi = proofs;
      this.liiIIiiIIi = nanos;
      this.IIIlIiiIIi = astar;
      this.iiiIIiiIIi = revalidate;
   }

   public lIliliIiiIliliIi(iiIIIIliIIlIIIli ledger, lliiillliliiilll rt, iIlIiIllIi search) {
      this.liiIIiiIIi = 2;
      this.iiiIIiiIIi = 64;
      this.IIIlIiiIIi = 2000000L;
      this.iIIlIiiIIi = Integer.MIN_VALUE;
      this.IliIIiiIIi = ledger;
      this.lliIIiiIIi = rt;
      this.iliIIiiIIi = search;
   }

   public void IiIlliIliiIl(int deckY, long feet, long column, IiIlIiiliIlIii cell, int tick) {
      this.IliIIiiIIi.liiiIIllIl(deckY, feet, iIiIiIilIliIiIil.IIIIIilIil, feet, column, cell, tick);
   }

   public iiIIIIliIIlIIIli Iiilliiliiil() {
      return this.IliIIiiIIi;
   }

   public int Iiiiliiiiiii() {
      return this.IIllIiiIIi;
   }

   public lllIiIllillIiIll IlIillIiilIi() {
      return this.IlIlIiiIIi;
   }

   public IIlilllllIlillll lIiiIiIlilli(iiIillIlIIlillIl feet, long tick, int d) {
      if (this.lIIlIiiIIi) {
         this.lIIlIiiIIi = false;
         return IIlilllllIlillll.IiiIliIill;
      } else if (feet.IliIlllilIi()) {
         return IIlilllllIlillll.iiiIliIill;
      } else if (feet.liiiIIllIl() == Iiiiilllliiiilll.iIlllllill && feet.IilliliilIIi() != null) {
         this.iliIiiliiiii(tick, d);
         return this.lliIIiiIIi.Iiilliiliiil() ? IIlilllllIlillll.iiiIliIill : IIlilllllIlillll.liiIliIill;
      } else {
         if ((this.lliIIiiIIi.Ililllililil() || this.lliIIiiIIi.Iiilliiliiil())
            && (feet.IilliliilIIi() == null || feet.iIlIlllllill() != this.lliIIiiIIi.IiIiliIiiiIi())) {
            this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<"llIIlilIIl","+JrP8YQEFzqutxiNusnsPgQuzXYYRTvGOS/aJW5+0JZ2PUv80pMSbdvUI3pv5NT2aQ==">() + feet.liiiIIllIl());
         }

         return IIlilllllIlillll.iliIliIill;
      }
   }

   public IIlilllllIlillll iIlIlllllill(long enabled, int feet, boolean tick, boolean otherOwns) {
      if (!this.lliIIiiIIi.Ililllililil() && !this.lliIIiiIIi.Iiilliiliiil()) {
         return IIlilllllIlillll.iliIliIill;
      } else if (tick) {
         this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<"llIIlilIIl","otEnhQU7WbX72Es1F92sLhYHZECST1+wu3QaE/kPX6xYPj0IhyHNIt/753JWixCjU66mgvgZj3i3SqI=">());
         return IIlilllllIlillll.iliIliIill;
      } else if (!otherOwns) {
         this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<"llIIlilIIl","t8HZnrn3spmn+RWYYw2WddTHa76BcYAoEOiRcoXTenoNRHnKrEzRJwk=">());
         return IIlilllllIlillll.iliIliIill;
      } else if (!this.iliIIiiIIi.IIIllIIliIIl(this.lliIIiiIIi.IiIiliIiiiIi())) {
         this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<"llIIlilIIl","47+IpMdkstseXqTKeq9MuDcBd8UtNtNkS+lcOmx5/+Bl5MIfUqvOskkIlt2/F6LUgVFL9YwipQ==">());
         return IIlilllllIlillll.iliIliIill;
      } else {
         Illlllllllllllll var6 = this.iliIIiiIIi.iIlIlllllill();
         if (!var6.IliIlllilIi()) {
            this.IilliliilIIi(this.lliIIiiIIi.IiIiliIiiiIi(), var6);
            return IIlilllllIlillll.iliIliIill;
         } else {
            this.iliIiiliiiii(enabled, feet);
            return this.lliIIiiIIi.Iiilliiliiil() ? IIlilllllIlillll.iiiIliIill : IIlilllllIlillll.liiIliIill;
         }
      }
   }

   public void Illlllllilll(int deckY) {
      this.IliIIiiIIi.IIlilIliiIli(deckY);
      this.lliIIiiIIi.IIlllIlliIll();
   }

   public ilIIiIIiIiIIiIIi IIIllIIliIIl(int deckY, boolean walkOn, boolean onDeck) {
      ilIIiIIiIiIIiIIi var4 = !walkOn && !onDeck && this.lliIIiiIIi.Iiilliiliiil() && this.lliIIiiIIi.IiIiliIiiiIi() == deckY
         ? this.lliIIiiIIi.Illillliilli()
         : null;
      if (var4 != null) {
         this.iiIlIiiIIi++;
         this.lliIIiiIIi.iliIiiliiiii();
      } else {
         if (!walkOn && !onDeck) {
            this.IIllIiiIIi++;
         }

         if (this.lliIIiiIIi.IlIillIiilIi(deckY)) {
            this.lliIIiiIIi
               .IiIlliIliiIl(
                  walkOn
                     ? llIIlilIIl<"llIIlilIIl","kIKFV9qmGEHBaQOO6kD3IXpOQeH59q8cmdFIqD4K8OgwA1c=">()
                     : llIIlilIIl<"llIIlilIIl","j422dYILRdtDQDXYAQq0Xow+t6BICEQvf+jeRM4ZZvwFKfsl2TwjxoQ=">()
               );
         }
      }

      return var4;
   }

   public String iIIIlIlIIl() {
      return this.IliIIiiIIi.IllIllllIl()
         + llIIlilIIl<"llIIlilIIl","K71tkSVS6kDX7RXGojrv1xHItGTv/lC1G+QTPuo=">()
         + this.lliIIiiIIi.ilIllIiIll()
         + llIIlilIIl<"llIIlilIIl","K71tkSVS6kDX7RXGojrv1xHItGTv/lC1G+QTPuo=">()
         + this.IIIIllIIIl();
   }

   public int Iilililiiili() {
      return this.IiIlIiiIIi;
   }

   public String IIIIllIIIl() {
      return llIIlilIIl<"llIIlilIIl","tXfDScsUpLoFQa/Gc6sipUtdnt6T2urdWw/xdhlufLbtJ+JNXhcc9MlGdn9+13U=">()
         + this.llIlIiiIIi
         + llIIlilIIl<"llIIlilIIl","zsRrNLrFozfem3chquspkctR66A6tXA8MobUuHrsV3U0AcGA6qU9aobUc6ph">()
         + this.lIllIiiIIi / 1000000L
         + llIIlilIIl<"llIIlilIIl","5LmOwqCqaci2mReHkzAgj6bIZ35EzSoGw7lXLPXEel+IJaMUJy5hDqc5ZdZosvPJ0w==">()
         + this.ilIlIiiIIi
         + llIIlilIIl<"llIIlilIIl","feCuHOsF778gE3zkzSvtut1AYPffPeyZHCrfjlFb68x7R1X7DzyUBZCKiLbcg2LkCoZ7JctAHloIEkKO6EkrXw==">()
         + this.IiIlIiiIIi
         + llIIlilIIl<"llIIlilIIl","ypEQPt2zJmwWWHhhr29P/DPqixkXD+pOzI+FFpDSd354lzIliyIc+zSbdXqF5+DBu2wDn6RWu4OwLhc7jZJK">()
         + this.liIlIiiIIi
         + llIIlilIIl<"llIIlilIIl","tdV1osS4MFr/uewxD2VrHs1XvTTGkA8aPr5s37BWW4dIT3PAjruANl9khG18izj3jgc6QMdzSQ==">()
         + this.iiIlIiiIIi
         + llIIlilIIl<"llIIlilIIl","/2eVTsbEwO6F4T88AoUO0clkudSSuEue3Rn+pMDyTLceJhtep8gMDgli5HPl2EQmaPIyR5feBfo=">()
         + this.IIllIiiIIi;
   }

   public lllIiIllillIiIll iliIiiliiiii(long tick, int feet) {
      if (this.iIIlIiiIIi == feet) {
         return this.IlIlIiiIIi;
      } else {
         this.iIIlIiiIIi = feet;
         if (!this.lliIIiiIIi.Ililllililil()) {
            return this.IlIlIiiIIi = new lllIiIllillIiIll(this.lliIIiiIIi.IIillIiliIil(), 0, 0, 0, false, null);
         } else {
            long var4 = this.iliIIiiIIi.IlIlllIlilIl();
            this.llIlIiiIIi++;
            lllIiIllillIiIll var6 = this.lliIIiiIIi
               .Iilllilliill(
                  new illIliIilIli(this.IiiIIiiIIi, this.liiIIiiIIi, var4 + this.IIIlIiiIIi),
                  this.IliIIiiIIi,
                  this.iliIIiiIIi.lIiiIiIlilli(),
                  this.iliIIiiIIi::iliIiiliiiii,
                  tick,
                  feet,
                  this.iliIIiiIIi::IlIlllIlilIl
               );
            this.lIllIiiIIi = this.lIllIiiIIi + (this.iliIIiiIIi.IlIlllIlilIl() - var4);
            if (var6.iliIiiliiiii()) {
               this.ilIlIiiIIi++;
            }

            return this.IlIlIiiIIi = var6;
         }
      }
   }

   public void Iilllilliill(String why) {
      if (this.lliIIiiIIi.Ililllililil() || this.lliIIiiIIi.Iiilliiliiil()) {
         this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<"llIIlilIIl","korkXAVcGs+pr3yUePF5sZETHM0GL/I3u3infqPzQmUdpSv9rc6DQyXQ">() + why);
      }
   }

   public Iiiiilllliiiilll liiiIIllIl(Iiilliiliiil tick, long feet, int revision, long dk) {
      long var11 = 9156050595613695765L;
      if (!tick.iIlIlllllill(feet) && this.iliIIiiIIi.liiiIIllIl(tick) == 0L) {
         List var7 = this.iliIIiiIIi.IliIlllilIi(tick);
         if (var7.isEmpty()) {
            if (this.lliIIiiIIi.IlIillIiilIi(tick.IiiiIlliiiIl)) {
               this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<"llIIlilIIl","5hJKbou45ePVspa14+5UTAXtBatU/IaRMmagcXgiXNy8ETxgpwZ0dUtNN3wlVK0=">());
            }

            this.IliIIiiIIi.Iilllilliill(tick.IiiiIlliiiIl);
            this.liIlIiiIIi++;
            return Iiiiilllliiiilll.lIlllllill;
         } else {
            this.IliIIiiIIi.Ililllililil(tick.IiiiIlliiiIl);
            Illlllllllllllll var8 = this.iliIIiiIIi.iIlIlllllill();
            if (!var8.IliIlllilIi()) {
               if (var8.lIiiIiIlilli() && var8.iIlIlllllill() && var8.IilliliilIIi() && this.iliIIiiIIi.IilliliilIIi()) {
                  this.lIIlIiiIIi = true;
               }

               if (this.lliIIiiIIi.IlIillIiilIi(tick.IiiiIlliiiIl) && !this.lliIIiiIIi.IIIilIIiiIIi()) {
                  this.lliIIiiIIi
                     .IiIlliIliiIl(llIIlilIIl<"llIIlilIIl","4spVFYkH/5XSaOUZTljRML9bZ87AO0Krg4zsckpyiNGlEiJlZZ+SwI6bcmHA8D1mCcjVg+w=">() + var8.liiiIIllIl());
               }

               this.IliIIiiIIi.Iiilliiliiil(tick.IiiiIlliiiIl, var8);
               return Iiiiilllliiiilll.Illllllill;
            } else {
               this.IliIIiiIIi.IlIillIiilIi(tick.IiiiIlliiiIl, var8);
               if (!this.lliIIiiIIi.IlIillIiilIi(tick.IiiiIlliiiIl)) {
                  this.lliIIiiIIi.IliIlllilIi(tick, var7, feet, revision, dk);
                  return Iiiiilllliiiilll.iIlllllill;
               } else {
                  this.lliIIiiIIi.liiiIIllIl(tick);
                  var11 ^= ((long)this.lliIIiiIIi.IIIilIIiiIIi() << 32 ^ var11) & -1L << 32;
                  if (this.lliIIiiIIi.iIlIlllllill(var7, feet) > 0 && (int)(var11 >>> 32) != 0) {
                     this.IliIIiiIIi.IIlllIlliIll(lliIllililiIllil.IIlIiliIil);
                  }

                  if (this.lliIIiiIIi.IIIilIIiiIIi()) {
                     List var10 = this.IliIIiiIIi
                        .iliIiiliiiii(tick.IiiiIlliiiIl, this.lliIIiiIIi.illIlIilIl(), this.iliIIiiIIi.lIiiIiIlilli(), this.iiiIIiiIIi);
                     if (!var10.isEmpty()) {
                        this.lliIIiiIIi.lIiiIiIlilli(var10, this.IliIIiiIIi.Illlllllilll());
                     }
                  }

                  if (this.lliIIiiIIi.Ililllililil()) {
                     return Iiiiilllliiiilll.iIlllllill;
                  } else if (this.lliIIiiIIi.Iiilliiliiil()) {
                     return Iiiiilllliiiilll.iIlllllill;
                  } else {
                     this.IliIIiiIIi.IiIiliIiiiIi();
                     return Iiiiilllliiiilll.IIlllllill;
                  }
               }
            }
         }
      } else {
         return Iiiiilllliiiilll.liiIlllill;
      }
   }

   public int IiIiliIiiiIi() {
      return this.llIlIiiIIi;
   }

   public int IIiilIiiiIii() {
      return this.liIlIiiIIi;
   }

   public void IlIlllIlilIl(int pinned, ilIIiIIiIiIIiIIi tick, IllIiillllIiil feet, long why, int deckY, String v) {
      if (tick != null && feet != null && feet.lIiiIiIlilli() != null) {
         this.IliIIiiIIi
            .iIlIlllllill(pinned, tick.liiiIIllIl(), feet.lIiiIiIlilli(), feet.iliIiiliiiii(), why, feet.IiIlliIliiIl(), deckY, feet.Iilllilliill());
      }

      this.lliIIiiIIi.IIIllIIliIIl(tick == null ? Long.MIN_VALUE : tick.liiiIIllIl(), v);
   }

   public void IIillIiliIil() {
      if (this.lliIIiiIIi.Ililllililil()) {
         this.IiIlIiiIIi++;
      }
   }

   public int IIlilIliiIli() {
      return this.ilIlIiiIIi;
   }
}
