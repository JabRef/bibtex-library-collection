.so bibtex.header
		  
@Article{tpspafdolp,
  author       = "Moriconi, Mark and Hare, Dwight~F.",
  title        = "The {PegaSys} System:  Pictures as Formal Documentation of Large Programs",
  journal      = toplas,
  year         = 1986,
  volume       = 8,
  number       = 4,
  pages        = "524--546",
  month        = oct,
  keywords     = "design, documentation, theory, verification, ada, data and
    control dependencies, design hierarchy, graphical formalism, mechanical
    design procedure, programming in the large",
  abstract     = "PegsSys is an experimental system in which a user formally
    describes how a program is put together by means of a hierarchically
    structured collection of pictures, called formal dependency diagrams
    (FDDs).  Icons in an FDD denote a wide range of data and control
    dependencies among the relatively coarse-grained entities contained in
    large programs.  Dependencies considered atomic with respect to one level
    in a hierarchy can be decomposed into a number of dependencies at a lower
    level.  Each dependency can be a predefined primitive of the FDD language
    or it can be defined by a PegaSys user in terms of the primitives.  A
    PegsSys user is given the illusion that logical formulas do not exist, even
    though PegaSys reasons about them internally.  This involves (1) checking
    whether an FDD is meaningful syntactically, (2) determining whether
    hierarchical refinements of an FDD are methodologically sound, and (3)
    deciding whether an FDD hierarchy is logically consistent with the program
    that it is intended to describe.  The techniques used to provide these
    capabilities are discussed along with the logical properties that enable
    PegaSys to maintain the user illusion.", 
  location     = "http://dx.doi.org/10.1145/6465.6478"
}

@Article{edafrcohsn,
  author       = "Bhoedjang, Raoul A.~F. and Verstoep, Kees and R{\" u}hl, Tim and Bal, Henri~E. and Hofman, Rutger F.~H.",
  title        = "Evaluating Design Alternatives for Reliable Communication on High-Speed Networks",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems (ASPLOS IX))",
  year         = 2000,
  volume       = 34,
  number       = 5,
  pages        = "71--81",
  month        = dec,
  keywords     = "network interfaces, parallel programming systems, network
    performance, multicast, reliability, broadcast",
  abstract     = "We systematically evaluate the performance of five
    implementations of a single, user-level communication interface.  Each
    implementation makes different architectural assumptions about the
    reliability of the network hardware and the capabilities of the network
    interface.  The implementations differ accordingly in their division of
    protocol tasks between host software, network-interface firmware, and
    network hardware.  Using microbenchmarks, parallel-programming systems, and
    parallel applications, we assess the performance impact of different
    protocol decompositions.  We show how moving protocol tasks to a relatively
    slow network interface yields both performance advantages and
    disadvantages, depending on the characteristics of the application and the
    underlying parallel-programming system.  In particular, we show that a
    communication system that assumes highly reliable network hardware and that
    uses network-interface support to process multicast traffic performs best
    for all applications.",
  location     = "http://www.cs.cornell.edu/raoul/papers/asplos2000.pdf", 
  location     = "http://dx.doi.org/10.1145/384264.379004"
}

@Article{amfsorfp,
  author       = "Banerjee, Debasish",
  title        = "{A} Methodology for Synthesis of Recursive Functional Programs",
  journal      = toplas,
  year         = 1987,
  volume       = 9,
  number       = 3,
  pages        = "441--462",
  month        = jul,
  keywords     = "programming from example, fp systems, least fixed point,
    recursive programs, program transformation",
  abstract     = "John Backus introduced the Functional Programming (FP)
    system, the variable-free applicative system having reduction semantics.
    Backus has also introduced a unique expansion technique for reasoning about
    a class of recursive FP programs.  As a natural outgrowth of this expansion
    technique, an FP program synthesis methodology is described in this paper.
    The methodology synthesizes recursive FP programs of the form f = p →, q;
    E(f .  h) from their preformulated case-by-case descriptions, which in turn
    come from given input-output example specifications.  After explaining the
    methodology informally, formalization in the form of a definition and a
    synthesis theorem is introduced.  A sufficient condition for the functional
    form E, for successful synthesis under the present methodology, is obtained
    structurally.  Several illustrative examples of synthesis are also
    included.", 
  location     = "http://dx.doi.org/10.1145/24039.24071"
}

@Article{tcoas86,
  author       = "Turchin, Valentin~F.",
  title        = "The Concept of a Supercompiler",
  journal      = toplas,
  year         = 1986,
  volume       = 8,
  number       = 3,
  pages        = "292--325",
  month        = jul,
  keywords     = "program transformation, lazy evaluation, rafel, metasystem
  transition, program optimization, supercompilation, prolog",
  abstract     = "A supercompiler is a program transformer of a certain type.
    It traces the possible generalized histories of computation by the original
    program, and compiles an equivalent program, reducing in the process the
    redundancy that could be present in the original program.  The nature of
    the redundancy that can be eliminated by supercompilation may be various,
    e.g., some variables might have predefined values (as in partial
    evaluation), or the structure of control transfer could be made more
    efficient (as in lazy evaluation), or it could simply be the fact that the
    same variable is used more than once.  The general principles of
    supercompilation are described and compared with the usual approach to
    program transformation as a stepwise application of a number of equivalence
    rules.  It is argued that the language Refal serves the needs of
    supercompilation best.  Refal is formally defined and compared with Prolog
    and other languages.  Examples are given of the operation of a Refal
    supercompiler implemented at CCNY on an IBM/370.", 
  location     = "http://dx.doi.org/10.1145/5956.5957"
}

@Article{tgocp,
  author       = "Carson, Scott~D. and {Reynolds, Jr.}, Paul~F.",
  title        = "The Geometry of Concurrent Programs",
  journal      = toplas,
  year         = 1987,
  volume       = 9,
  number       = 1,
  pages        = "25--53",
  month        = jan,
  keywords     = "deadlock detection, semaphore properties",
  abstract     = "Synchronization errors in concurrent programs are notoriously
    difficult to find and correct.  Deadlock, partial deadlock, and unsafeness
    are conditions that constitute such errors.  A model of concurrent
    semaphore programs based on multidimensional, solid geometry is presented.
    While previously reported geometric models are restricted to two-process
    mutual exclusion problems, the model described here applies to a broader
    class of synchronization problems.  The model is shown to be exact for
    systems composed of an arbitrary, yet fixed number of concurrent processes,
    each consisting of a straight line sequence of arbitrarily ordered
    semaphore operations.", 
  location     = "http://dx.doi.org/10.1145/9758.9759"
}

@Article{eodbms,
  author       = "Fry, James~P. and Sibley, Edgar~H.",
  title        = "Evolution of Data-Base Management Systems",
  journal      = surveys,
  year         = 1976,
  volume       = 8,
  number       = 1,
  pages        = "7--42",
  month        = mar,
  keywords     = "database management, distributed databases, special-purpose
    languages, standards, data definition", 
  abstract     = "This paper deals with the history and definitions common to 
    data-base technology.  It delimits the objectives of data-base management
    systems, discusses important concepts, and defines terminology for use by
    other papers in this issue, traces the development of data-base systems
    methodology, gives a uniform example, and presents some trends and issues.
    Keywords and Phrases: data base, data-base management, data definition,
    data manipulation, generalized processing, data model, data independence,
    distributed data base, data-base machines, data dictionary", 
  location     = "http://dx.doi.org/10.1145/356662.356664"
}

@Article{ttplcacm,
  author       = "Holt, Richard~C. and Cordy, James~R.",
  title        = "The {T}uring Programming Language",
  journal      = cacm,
  year         = 1988,
  volume       = 31,
  number       = 12,
  pages        = "1410--1423",
  month        = dec,
  keywords     = "programming languages, design, pascal, ada",
  abstract     = "Turing, a new general purpose programming language, is 
    designed to have Basic's clean interactive syntax, Pascal's elegance, and
    C's flexibility.", 
  location     = "http://dx.doi.org/10.1145/53580.53581"
}

@Article{papa,
  author       = "Lebeck, Alvin~R. and Fan, Xiaobo and Zeng, Heng and Ellis, Carla",
  title        = "Power Aware Page Allocation",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "105--116",
  month        = dec,
  keywords     = "power management, page-allocation algorithms, dram",
  abstract     = "One of the major challenges of post-PC computing is the need
    to reduce energy consumption, thereby extending the lifetime of the
    batteries that power these mobile devices.  Memory is a particularly
    important target for efforts to improve energy efficiency.  Memory
    technology is becoming available that offers power management features such
    as the ability to put individual chips in any one of several different
    power modes.  In this paper we explore the interaction of page placement
    with static and dynamic hardware policies to exploit these emerging
    hardware features.  In particular, we consider page allocation policies
    that can be employed by an informed operating system to complement the
    hardware power management strategies.  We perform experiments using two
    complementary simulation environments: a trace-driven simulator with
    workload traces that are representative of mobile computing and an
    execution-driven simulator with a detailed processor/memory model and a
    more memory-intensive set of benchmarks (SPEC2000).  Our results make a
    compelling case for a cooperative hardware/software approach for exploiting
    power-aware memory, with down to as little as 45% of the Energy&bull; Delay
    for the best static policy and 1% to 20% of the Energy&bull; Delay for a
    traditional full-power memory.", 
  location     = "http://dx.doi.org/10.1145/378995.379007", 
  location     = "https://users.cs.duke.edu/~alvy/papers/CS-2000-08.pdf"
}

@Article{moas,
  author       = "Enslow Jr., Philip",
  title        = "Multiprocessor Organization---{A} Survey",
  journal      = surveys,
  year         = 1977,
  volume       = 9,
  number       = 1,
  pages        = "103--129",
  month        = mar,
  keywords     = "Computer system organization, concurrent operations,
  interconnection subsystems, multiprocessor operating systems,
  multiprocessors, simultaneous operations",
  abstract     = "Multiprocessors are defined as a subclass of MIMD (Multiple
    Instruction Stream, Multiple Data Stream) multiple-computer systems in
    which the processors have common access to primary memory and the
    input/output channels and there is a single operating system controlling
    the entire complex.  It is possible to characterize the hardware
    organization by the nature of the system utilized to interconnect the
    primary functional units--processors, memory, and input/output channels.
    The three basic interconnection systems discussed are: 1) time-shared
    buses; 2) crossbar switch matrix; and 3) multibus, multiport memories.
    Three organizations for multiprocessor operating systems are also
    discussed: 1) master-slave; 2) separate executive for each processor; and
    3) symmetric treatment of all processors.", 
  location     = "http://dx.doi.org/10.1145/356683.356688"
}

@Article{enpceuht,
  author       = "Kawahito, Motohiro and Komatsu, Hideaki and Nakatani, Toshio",
  title        = "Effective Null Pointer Check Elimination Utilizing Hardware Trap",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "139--149",
  month        = dec,
  keywords     = "java, null pointer checks, page-access optimizations",
  abstract     = "We present a new algorithm for eliminating null pointer
    checks from programs written in Java&trade;.  Our new algorithm is split
    into two phases.  In the first phase, it moves null checks backward, and it
    is iterated for a few times with other optimizations to eliminate redundant
    null checks and maximize the effectiveness of other optimizations.  In the
    second phase, it moves null checks forward and converts many null checks to
    hardware traps in order to minimize the execution cost of the remaining
    null checks.  As a result, it eliminates many null checks effectively and
    exploits the maximum use of hardware traps.  This algorithm has been
    implemented in the IBM cross-platform Java Just-in-Time (JIT) compiler.
    Our experimental results show that our approach improves performance by up
    to 71% for jBYTEmark and up to 10% for SPECjvm98 over the previously known
    best algorithm.  They also show that it increases JIT compilation time by
    only 2.3%.  Although we implemented our algorithm for Java, it is also
    applicable for other languages requiring null checking.", 
  location     = "http://dx.doi.org/10.1145/384264.379234"
}

@Article{oaafgsps,
  author       = "Kubiatowicz, John and Bindel, David and Chen, Yan and Czerwinski, Steven and Eaton, Patrick and Geels, Dennis and Gummadi, Ramakrishan and Rhea, Sean and Weatherspoon, Hakim and Weimer, Westley and Wells, Chris and Zhao, Ben",
  title        = "{OceanStore}: An Architecture for Global-Scale Persistent Storage",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "190--201",
  month        = dec,
  keywords     = "peer-to-peer networking, remote storage, autonomy, ad-hoc
    routing, archival storage",
  abstract     = "OceanStore is a utility infrastructure designed to span the 
    globe and provide continuous access to persistent information.  Since this
    infrastructure is comprised of untrusted servers, data is protected through
    redundancy and cryptographic techniques.  To improve performance, data is
    allowed to be cached anywhere, anytime.  Additionally, monitoring of usage
    patterns allows adaptation to regional outages and denial of service
    attacks; monitoring also enhances performance through pro-active movement
    of data.  A prototype implementation is currently under development.",  
  location     = "http://dx.doi.org/10.1145/356989.357007",  
  location     = "https://www.cs.virginia.edu/~weimer/p/p190-kubi.pdf"
}

@Article{aawa,
  author       = "Olivier Arsac and St{\' e}phane Dalmas and Marc Ga{\" e}tano",
  title        = "Algorithm Animation with {AGAT}",
  journal      = "Computer-Human Interaction in Symbolic Computation",
  year         = 1998,
  volume       = "",
  number       = "",
  pages        = "89--115",
  month        = "",
  keywords     = "algorithm animation, stream computing, client-server
    computing, data analysis",
  abstract     = "Algorithm animation is a powerful tool for exploring a 
    program’s behavior.  It is used in various areas of computer science, such
    as teaching (Rasala et al.  1994), design and analysis of algorithms
    (Bentley and Kernighan 1991), performance tuning (Duisberg 1986).
    Algorithm animation systems provide a form of program visualization that
    deals with dynamic graphical displays of a program’s operations.  They
    offer many facilities for users to view and interact with an animated
    display of an algorithm, by providing ways to control through multiple
    views the data given to algorithms and their execution.", 
  location     = "http://dx.doi.org/10.1007/978-3-7091-6461-7_6"
}

@Article{tenw,
  author       = "Wirth, Niklaus",
  title        = "Type Extensions",
  journal      = toplas,
  year         = 1988,
  volume       = 10,
  number       = 2,
  pages        = "204--214",
  month        = apr,
  keywords     = "extensible data types, modula-2, polymorphism, type systems",
  abstract     = "Software systems represent a hierarchy of modules.  Client
    modules contain sets of procedures that extend the capabilities of imported
    modules.  This concept of extension is here applied to data types.
    Extended types are related to their ancestor in terms of a hierarchy.
    Variables of an extended type are compatible with variables of the ancestor
    type.  This scheme is expressed by three language constructs only: the
    declaration of extended record types, the type test, and the type guard.
    The facility of extended types, which closely resembles the class concept,
    is defined in rigorous and concise terms, and an efficient implementation
    is presented.", 
  location     = "http://dx.doi.org/10.1145/42190.46167"
}

@Article{pgm,
  author       = "Sedgewick, Robert",
  title        = "Permutation Generation Methods",
  journal      = surveys,
  year         = 1977,
  volume       = 9,
  number       = 2,
  pages        = "137--164",
  month        = jun,
  keywords     = "permutations, combinatorial algorithms, code optimization,
    algorithm analysis, lexicographic ordering, random permutations, recursion,
    cyclic rotation.",
  abstract     = "This paper surveys the numerous methods that have been
    proposed for permutation enumeration by computer.  The various algorithms
    which have been developed over the years are described in detail, and
    implemented in a modern Algol-like language.  All of the algorithms are
    derived from a single control structure.  The problems involved with
    implementing the best of the algorithms on real computers are treated in
    detail.  Assembly-language programs are derived and analyzed fully.  The
    paper is intended not only as a survey of permutation generation methods,
    but also as a tutorial on how to compare a number of different algorithms
    for the same task.", 
  location     = "http://dx.doi.org/10.1145/356689.356692"
}

@Article{sadfns,
  author       = "Hill, Jason and Szewczyk, Robert and Woo, Alec and Hollar, Seth and Culler, David and Pister, Kristofer",
  title        = "System Architecture Directiosn for Networked Sensors",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "93--104",
  month        = dec,
  keywords     = "networked sensors, system architecture, event-driven systems,
    power consumption, sensor networks, tinyos",
  abstract     = "Technological progress in integrated, low-power, CMOS
    communication devices and sensors makes a rich design space of networked
    sensors viable.  They can be deeply embedded in the physical world and
    spread throughout our environment like smart dust.  The missing elements
    are an overall system architecture and a methodology for systematic
    advance.  To this end, we identify key requirements, develop a small device
    that is representative of the class, design a tiny event-driven operating
    system, and show that it provides support for efficient modularity and
    concurrency-intensive operation.  Our operating system fits in 178 bytes of
    memory, propagates events in the time it takes to copy 1.25 bytes of
    memory, context switches in the time it takes to copy 6 bytes of memory and
    supports two level scheduling.  The analysis lays a groundwork for future
    architectural advances.", 
  location     = "http://dx.doi.org/10.1145/378993.379006"
}

@Article{cspm,
  author       = "Mattson, Peter and Dally, William~J. and Rixner, Scott and Kapasi, Ujval~J. and Owens, John~D.",
  title        = "Communication Scheduling",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "82--92",
  month        = dec,
  keywords     = "interconnection networks, instruction scheduling, cpu
    architectures", 
  abstract     = "The high arithmetic rates of media processing applications
    require architectures with tens to hundreds of functional units, multiple
    register files, and explicit interconnect between functional units and
    register files.  Communication scheduling enables scheduling to these
    emerging architectures, including those that use shared buses and register
    file ports.  Scheduling to these shared interconnect architectures is
    difficult because it requires simultaneously allocating functional units to
    operations and buses and register file ports to the communications between
    operations.  Prior VLIW scheduling algorithms are limited to clustered
    register file architectures with no shared buses or register file ports.
    Communication scheduling extends the range of target architectures by
    making each communication explicit and decomposing it into three
    components: a write stub, zero or more copy operations, and a read stub.
    Communication scheduling allows media processing kernels to achieve 98% of
    the performance of a central register file architecture on a distributed
    register file architecture with only 9% of the area, 6% of the power
    consumption, and 37% of the access delay, and 120% of the performance of a
    clustered register file architecture on a distributed register file
    architecture with 56% of the area and 50% of the power consumption.", 
  location     = "http://dx.doi.org/10.1145/378993.379005"
}

@Article{dfaisr,
  author       = "Fosdick, Lloyd~D. and Osterweil, Leon~J.",
  title        = "Data Flow Analysis in Software Reliability",
  journal      = surveys,
  year         = 1976,
  volume       = 8,
  number       = 3,
  pages        = "305--330",
  month        = sep,
  keywords     = "automatic documentation, automatic error detection, data flow
    analysis, software reliability, control-flow graphs, static analysis,
    fortran, compilation",
  abstract     = "The ways that the methods of data flow analysis can be 
    applied to improve software reliability are described.  There is also a
    review of the basic terminology from graph theory and from data flow
    analysis in global program optimization.  The notation of regular
    expressions is used to describe actions on data for sets of paths.  These
    expressions provide the basis of a classification scheme for data flow
    which represents patterns of data flow along paths within subprograms and
    along paths which cross subprogram boundaries.  Fast algorithms, originally
    introduced for global optimization, are described and it is shown how they
    can be used to implement the classification scheme.  It is then shown how
    these same algorithms can also be used to detect the presence of data flow
    anomalies which are symptomatic of programming errors.  Finally, some
    characteristics of and experience with DAVE, a data flow analysis system
    embodying some of these ideas, are described.",
  location     = "http://dx.doi.org/10.1145/356674.356676"
}

@Article{spfhpplim,
  author       = "Duesterwald, Evelyn and Bala, Vasanth",
  title        = "Software Profiling for Hot Path Prediction:  Less is More",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "202--211",
  month        = dec,
  keywords     = "path prediction, jit compilation, dynamic analysis, hot-spot
    detection",
  abstract     = "Recently, there has been a growing interest in exploiting
    profile information in adaptive systems such as just-in-time compilers,
    dynamic optimizers and, binary translators.  In this paper, we show that
    sophisticated software profiling schemes that provide highly accurate
    information in an offline setting are ill-suited for these dynamic code
    generation systems.  We experimentally demonstrate that hot path
    predictions must be made early in order to control the rising cost of
    missed opportunity that result from the prediction delay.  We also show
    that existing sophisticated path profiling schemes, if used in an online
    setting, offer no prediction advantages over simpler schemes that exhibit
    much lower runtime overheads.Based on these observation we developed a new
    low-overhead software profiling scheme for hot path prediction.  Using an
    abstract metric we compare our scheme to path profile based prediction and
    show that our scheme achieves comparable prediction quality.  In our second
    set of experiments we include runtime overhead and evaluate the performance
    of our scheme in a realistic application: Dynamo, a dynamic optimization
    system.  The results show that our prediction scheme clearly outperforms
    path profile based prediction and thus confirm that less profiling as
    exhibited in our scheme will actually lead to more effective hot path
    prediction.", 
  location     = "http://dx.doi.org/10.1145/356989.357008"
}

@Article{tscf,
  author       = "Clif Flynt",
  title        = "{TCL} Scrollbars",
  journal      = login,
  year         = 2002,
  volume       = 27,
  number       = 3,
  pages        = "25--30",
  month        = jun,
  keywords     = "tcl, tk, scrollbars, canvas",
  location     = "https://www.usenix.org/publications/login/june-2002-volume-27-number-3/tclsh-spot"
}

@Article{oaccitdoti6a,
  author       = "Zahir, Rumi and Ross, Jonathan and Morris, Dale and Hess, Drew",
  title        = "{OS} and Compiler Considerations in the Design of the {IA}-64 Architecture",
  journal      = osr # " (" # pot # "Ninth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS IX)",
  year         = 2000,
  volume       = 28,
  number       = 5,
  pages        = "212--221",
  month        = dec,
  keywords     = "cpu architecture, speculative execution, compiler
    optimization, operating system optimizations",
  abstract     = "Increasing demands for processor performance have outstripped
    the pace of process and frequency improvements, pushing designers to find
    ways of increasing the amount of work that can be processed in parallel.
    Traditional RISC architectures use hardware approaches to obtain more
    instruction-level parallelism, with the compiler and the operating system
    (OS) having only indirect visibility into the mechanisms used.The IA-64
    architecture [14] was specifically designed to enable systems which create
    and exploit high levels of instruction-level parallelism by explicitly
    encoding a program's parallelism in the instruction set [25].  This paper
    provides a qualitative summary of the IA-64 architecture features that
    support control and data speculation, and register stacking.  The paper
    focusses on the functional synergy between these architectural elements
    (rather than their individual performance merits), and emphasizes how they
    were designed for cooperation between processor hardware, compilers and the
    OS.", 
  location     = "http://dx.doi.org/10.1145/378993.379242"
}

@Article{asoatfda,
  author       = "Weide, Bruce",
  title        = "A Survey of Analysis Techniques for Discrete Algorithms",
  journal      = surveys,
  year         = 1977,
  volume       = 9,
  number       = 4,
  pages        = "291--313",
  month        = dec,
  keywords     = "algorithms analysis,  computational  complexity,
   combinatorics,  NP-complete problems,  approximation  algorithms", 
  abstract     = "This survey includes an introduction to the concepts of 
    problem complexity, analysis of algorithms to find bounds on complexity,
    average-case behavior, and approximation algorithms The major techniques
    used m analysis of algorithms are reviewed and examples of the use of these
    methods are presented.  A brief explanation of the problem classes P and
    NP, as well as the class of NP-complete problems, is also presented.", 
  location     = "http://dx.doi.org/10.1145/356707.356711"
}

@Article{paicp,
  author       = "R.~C.~B. Cooper and K.~G. Hamilton",
  title        = "Preserving Abstraction in Concurrent Programming",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 2,
  pages        = "258--263",
  month        = feb,
  keywords     = "abstraction, clu, monitors, concurrency control, deadlock,
    interface, module, process, synchronization operating systems",
  abstract     = "Recent programming languages have attempted to provide
    support for concurrency and for modular programming based on abstract
    interfaces.  Building on experience of adding monitors to CLU, a language
    oriented towards data abstraction, it is explained how these two goals
    conflict.  In particular, the clash between conventional views on interface
    abstraction and the programming style required for avoiding monitor
    deadlock is discussed.  It is argued that the best compromise between these
    goals is a combination of a fine-grain locking mechanism together with a
    method for explicitly defining concurrency properties for selected
    interfaces",
  location     = "http://dx.doi.org/10.1109/32.4643"
}

@Article{tfsoasbis,
  author       = "David Gray",
  title        = "The Formal Specification of a Small Bookshop Information System",
  journal      = tse,
  year         = 1088,
  volume       = 14,
  number       = 2,
  pages        = "263--272",
  month        = feb,
  keywords     = "formal specifications, requirements analysis, mathematical
    specification, set theory, z",
  abstract     = "A specification, and its development, for a small bookshop
    information system are discussed.  the specification is presented using
    mathematics and the scheme calculus of C.  Morgan and B.  Sufrin.  An
    insight is given into how the specification was developed and why a formal
    specification is appropriate.", 
  location     = "http://dx.doi.org/10.1109/32.4644"
}

@Article{cgutmadp,
  author       = "Aho, Alfred~V. and Ganapathi, Mahadevan and Tjiang, Steven~W.~K.",
  title        = "Code Generation Using Tree Matching and Dynamic Programming",
  journal      = toplas,
  year         = 1989,
  volume       = 11,
  number       = 4,
  pages        = "491--516",
  month        = oct,
  keywords     = "twig, code generation, tree matching, dynamic programming,
    machine descriptions",
  abstract     = "Compiler-component generators, such as lexical analyzer
    generators and parser generators, have long been used to facilitate the
    construction of compilers.  A tree-manipulation language called twig has
    been developed to help construct efficient code generators.  Twig
    transforms a tree-translation scheme into a code generator that combines a
    fast top-down tree-pattern matching algorithm with dynamic programming.
    Twig has been used to specify and construct code generators for several
    experimental compilers targeted for different machines.", 
  location     = "http://dx.doi.org/10.1145/69558.75700"
}

@Article{pgpavt,
  author       = "Carlbom, Ingrid and Paciorek, Joseph",
  title        = "Planar Geometric Projections and Viewing Transformations",
  journal      = surveys,
  year         = 1978,
  volume       = 10,
  number       = 4,
  pages        = "465--502",
  month        = dec,
  keywords     = "computer graphics, viewing transformations, descriptive
    geometry, engineering drawing, architectural drawing, planar geometric
    projections, perspective projections, parallel projections", 
  abstract     = "In computer graphics one is often concerned with representing
    three-dimensional objects on a two-dimensional display surface.  The choice
    of such a representation depends on several factors, including the purpose
    for which the representation is intended, the visual effects that are
    desired, and the shape of the object.  This paper describes how
    two-dimensional views can be obtained using planar geometric projections
    such as perspective and parallel projections.  It discusses how these
    projections can be generated from a three-dimensional representation of an
    object in a manner suitable for computer graphics systems.  In particular,
    it shows how these projections can be generated using the viewing
    transformations of the Core Graphics System.  The factors that affect the
    choice of projection are also discussed, and some guidelines for making
    such a choice are given.", 
  location     = "http://dx.doi.org/10.1145/356744.356750"
}

@Article{tooms,
  author       = "Dasgupta, Subrata",
  title        = "The Organization of Microprogram Stores",
  journal      = surveys,
  year         = 1979,
  volume       = 11,
  number       = 1,
  pages        = "39--65",
  month        = mar,
  keywords     = "read-only memory, writable control store, vertical
    microprogrammmg, horizontal microprogramming, polyphase timing scheme,
    microinstruction, microword, emulation, machine organization, minimal
    encoding, microword length minimization, parallelism detecting, computer
    architecture, microprogram optimization, machine complexity", 
  abstract     = "A central issue in microprogramming is the organization of 
    the control store--the memory from which a microprogram is executed.  The
    structure of this store has a major influence on the economy (in both time
    and memory space) of the target machine implementation, on the overall
    complexity of the host machine organization, and on Its
    microprogrammabilty.  The first part of this paper surveys some aspects of
    control store architectures, including the organization of microinstruction
    words, and the effects of different timing schemes on the complexity of
    both control store and host machine organizations The latter part of the
    paper reviews some recent algorithms for optimizing the width and length of
    control stores.", 
  location     = "http://dx.doi.org/10.1145/356757.356761"
}

@Article{gdpgn,
  author       = "Nagy, George and Wagle, Sharad",
  title        = "Geographic Data Processing",
  journal      = surveys,
  year         = 1979,
  volume       = 11,
  number       = 2,
  pages        = "139--181",
  month        = jun,
  keywords     = "geographic information systems, geographic data processing,
    management reformation systems, automated cartography, computational
    geometry, natural resource management, graphic input and output, picture
    processing, remote sensing", 
  abstract     = "This survey attempts to provide a unified framework for the 
    constituent elements--originating in numerous and diverse disciplines--of
    geographical data processing systems.  External aspects of such systems, as
    perceived by potential users, are discussed with regard to extent,
    coordinate system and base map, range of applications, input/output
    mechanisms, computer configuration, command and interaction, documentation,
    and administration.The internal aspects, which would concern the system
    designer, are analyzed in terms of the type of spatial variables involved
    and of their interrelationship with respect to common operations This point
    of view is shown to lead to a workable classification of two-dimensional
    geometric algorithms and data structures.  To provide concrete examples,
    ten representative geographic data processing systems, ranging from
    automated cartography to interactive decision support, are described.  In
    conclusion, some comparisons are drawn between geographical data processing
    systems and their conventional business-oriented counterparts.", 
  location     = "http://dx.doi.org/10.1145/356770.356777"
}

@Article{fsfccdiosar,
  author       = "Gasbichler, Martin and Sperber, Michael",
  title        = "Final Shift for {\tt Call/cc}: Direct Implementation of {\tt Shift} and {\tt Reset}",
  journal      = sigplan # " (" # pot # "Seventh ACM SIGPLAN International Conference on Functional Programming, ICFP '02)",
  year         = 2002,
  volume       = 37,
  number       = 9,
  pages        = "271--282",
  month        = sep,
  keywords     = "continuations, implementation, scheme, scheme 48, virtual
    machines, delimited continuations",
  abstract     = "We present a direct implementation of the shift and reset
    control operators in the Scheme 48 system.  The new implementation improves
    upon the traditional technique of simulating shift and reset via call/cc.
    Typical applications of these operators exhibit space savings and a
    significant overall performance gain.  Our technique is based upon the
    popular incremental stack/heap strategy for representing continuations.  We
    present implementation details as well as some benchmark measurements for
    typical applications.",  
  location     = "http://dx.doi.org/10.1145/581478.581504"
}

@Article{eeocag,
  author       = "Jones, Larry~G.",
  title        = "Efficient Evaluation of Circular Attribute Grammars",
  journal      = toplas,
  year         = 1990,
  volume       = 12,
  number       = 3,
  pages        = "429--462",
  month        = jul,
  keywords     = "attribute circularity, attribute grammars, attribute grammar
    evaluation, fixed-point computation, incremental attribute evaluation",
  abstract     = "We present efficient algorithms for exhaustive and 
    incremental evaluation of circular attributes under any conditions that
    guarantee finite convergence.  The algorithms are derived from those for
    noncircular attribute grammars by partitioning the underlying attribute
    dependency graph into its strongly connected components and by ordering the
    evaluations to follow a topological sort of the resulting directed acyclic
    graph.  The algorithms are efficient in the sense that their worst-case
    running time is proportional to the cost of computing the fixed points of
    only those strongly connected components containing affected attributes or
    attributes directly dependent on affected attributes.  When the attribute
    grammar is noncircular or the specific dependency graph under consideration
    is acyclic, both algorithms reduce to the standard optimal algorithms for
    noncircular attribute evaluation.", 
  location     = "http://dx.doi.org/10.1145/78969.78971"
}

@Article{bfofaji,
  author       = "Ogata, Kazunori and Komatsu, Hideaki and Nakatani, Toshio",
  title        = "Bytecode Fetch Optimization for a {J}ava Interpreter",
  journal      = sigplan # " (" # pot # "Tenth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS X)",
  year         = 2002,
  volume       = 37,
  number       = 10,
  pages        = "58--67",
  month        = oct,
  keywords     = "bytecode interpretation, java, performance, powerpc,
    superscaler processor, stack caching, pipelined interpreter",
  abstract     = "Interpreters play an important role in many languages, and 
    their performance is critical particularly for the popular language Java.
    The performance of the interpreter is important even for high-performance
    virtual machines that employ just-in-time compiler technology, because
    there are advantages in delaying the start of compilation and in reducing
    the number of the target methods to be compiled.  Many techniques have been
    proposed to improve the performance of various interpreters, but none of
    them has fully addressed the issues of minimizing redundant memory accesses
    and the overhead of indirect branches inherent to interpreters running on
    superscalar processors.  These issues are especially serious for Java
    because each bytecode is typically one or a few bytes long and the
    execution routine for each bytecode is also short due to the low-level,
    stack-based semantics of Java bytecode.  In this paper, we describe three
    novel techniques of our Java bytecode interpreter, write-through
    top-of-stack caching (WT), position-based handler customization (PHC), and
    position-based speculative decoding (PSD), which ameliorate these problems
    for the PowerPC processors.  We show how each technique contributes to
    improving the overall performance of the interpreter for major Java
    benchmark programs on an IBM POWER3 processor.  Among three, PHC is the
    most effective one.  We also show that the main source of memory accesses
    is due to bytecode fetches and that PHC successfully eliminates the
    majority of them, while it keeps the instruction cache miss ratios small.", 
  location     = "http://dx.doi.org/10.1145/605432.605404"
}

@Article{paipefdavcp,
  author       = "Chow, Ching-Hua and Lam, Simon~S.",
  title        = "{PROSPEC}:  An Interactive Programming Environment for Designing and Verifying Communication Protocols",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 3,
  pages        = "327--338",
  month        = mar,
  keywords     = "analysis, verification, communication protocols, formal
    description techniques, formal specifications, programming environment,
    protocol design, reachability analysis, software tools",
  abstract     = "The PROSPEC software environment for designing and verifying
    communication protocols is described.  It integrates several tools that
    implement methods for protocol verification and construction (i.e., fair
    reachability analysis, multiphase construction, and protocol projection).
    The system provides a unified graphical interface to facilitate the
    application of these methods and creates an interactive environment for
    specifying, verifying, and designing communication protocols.  PROSPEC was
    used successfully to design and verify versions of BSC, X.21, X.25, and
    Telnet document transfer protocols.", 
  location     = "http://dx.doi.org/10.1109/32.4653"
}

@Article{wfsmh,
  author       = "Maurice Herlihy",
  title        = "Wait-Free Synchronization",
  journal      = toplas,
  year         = 1991,
  volume       = 13,
  number       = 1,
  pages        = "124--149",
  month        = jan,
  keywords     = "algorithms, language, verification, linearizability,
    wait-free synchronization",
  abstract     = "A wait-free implementation of a concurrent data object is one
    that guarantees that any process can complete any operation in a finite
    number of steps, regardless of the execution speeds of the other processes.
    The problem of constructing a wait-free implementation of one data object
    from another lies at the heart of much recent work in concurrent
    algorithms, concurrent data structures, and multiprocessor architectures.
    First, we introduce a simple and general technique, based on reduction to a
    concensus protocol, for proving statements of the form, “there is no
    wait-free implementation of X by Y.” We derive a hierarchy of objects such
    that no object at one level has a wait-free implementation in terms of
    objects at lower levels.  In particular, we show that atomic read/write
    registers, which have been the focus of much recent attention, are at the
    bottom of the hierarchy: thay cannot be used to construct wait-free
    implementations of many simple and familiar data types.  Moreover,
    classical synchronization primitives such astest&set and fetch&add, while
    more powerful than read and write, are also computationally weak, as are
    the standard message-passing primitives.  Second, nevertheless, we show
    that there do exist simple universal objects from which one can construct a
    wait-free implementation of any sequential object.", 
  location     = "https://cs.brown.edu/~mph/Herlihy91/p124-herlihy.pdf",
  location     = "http://dx.doi.org/10.1145/114005.102808"
}

@Article{saae,
  author       = "Gustavus~J. Simmons",
  title        = "Symmertic and Asymmetric Encryption",
  journal      = surveys,
  year         = 1979,
  volume       = 11,
  number       = 4,
  pages        = "305--330",
  month        = dec,
  keywords     = "cryptography, secure communications, asymmetric encryption,
  computational complexity, public-key cryptosystems, authentication, linear
  shift registers",
  abstract     = "All cryptosystems currently in use are symmetric in the sense
    that they require the transmitter and receiver to share, in secret, either
    the same piece of reformation (key) or one of a pair of related keys easily
    computed from each other, the key is used in the encryption process to
    introduce uncertainty to an unauthorized receiver.  Not only is an
    asymmetric encryption system one in which the transmitter and receiver keys
    are different, but in addition it Is computationally infeasible to compute
    at least one from the other.  Asymmetric systems make it possible to
    authenticate messages whose contents must be revealed to an opponent or
    allow a transmitter whose key has been compromised to communicate in
    privacy to a receiver whose key has been kept secret--neither of which is
    possible using a symmetric cryptosystem.  This paper opens with a brief
    discussion of encryption principles and then proceeds to a comprehensive
    discussion of the asymmetric encryption/decryption channel and its
    application in secure communications.", 
  location     = "http://dx.doi.org/10.1145/356789.356793"
}

@Article{pcssl,
  author       = "Simon~S. Lam",
  title        = "Protocol Conversion",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 3,
  pages        = "353--362",
  month        = mar,
  keywords     = "communication protocols, computer networks, internetworking,
    protocol architecture, protocol conversion, protocol projection, protocol
    verification",
  abstract     = "The problem of achieving communication between two processes
    across a network or an internetwork is considered.  The notion of logical
    connectivity between processes in a protocol is formalized.  The problem of
    constructing a protocol converter to achieve interoperability between
    processes that implement different protocols is addressed.  A formal model
    is presented, based on the theory of protocol projection, for reasoning
    about the semantics of different protocols and conversions between them.
    Two kinds of converters are presented: memoryless converters and
    finite-state converters.  The construction of some finite-state converters
    is illustrated, and examples are given.", 
  location     = "http://dx.doi.org/10.1109/32.4655",
  location     = "ftp://ftp.cs.utexas.edu/pub/techreports/tr87-05.pdf"
}

@Article{esrwst,
  author       = "Oplinger, Jeffrey and Lam, Monica~S.",
  title        = "Enhancing Software Reliability with Speculative Threads",
  journal      = sigplan # " (" # pot # "Tenth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS X)",
  year         = 2002,
  volume       = 37,
  number       = 10,
  pages        = "184--196",
  month        = oct,
  keywords     = "machine architecture, thread-level speculation, transactions,
    recovery, execution monitoring, transactional programming",
  abstract     = "This paper advocates the use of a monitor-and-recover
    programming paradigm to enhance the reliability of software, and proposes
    an architectural design that allows software and hardware to cooperate in
    making this paradigm more efficient and easier to program.  We propose that
    programmers write monitoring functions assuming simple sequential execution
    semantics.  Our architecture speeds up the computation by executing the
    monitoring functions speculatively in parallel with the main computation.
    For recovery, programmers can define fine-grain transactions whose side
    effects, including all register modifications and memory writes, can either
    be committed or aborted under program control.  Transactions are
    implemented efficiently by treating them as speculative threads.  Our
    experimental results suggest that monitored execution is more amenable to
    parallelization than regular program execution.  Code monitoring is sped up
    by a factor of 1.5 by exploiting single-thread instruction-level
    parallelism, and by an additional factor of 1.6 using thread-level
    speculation.  This results in an overall improvement of 2.5 times and a
    sustained 5.4 instructions-per-cycle performance.  A monitored execution
    that used to be 2.5 times slower executes with a degradation of only 12%
    when compared to the performance on the baseline machine.  We also show
    that the concept of fine-grain transactional programming is useful in
    catching buffer overrun errors through a number of real-life examples.", 
  location     = "http://dx.doi.org/10.1145/605397.605417",
  location     = "http://suif.stanford.edu/papers/asplos02.ps"
}

@Article{esbdmalpe,
  author       = "Sevin\d{c}, S{\" u}leyman and Zeigler, Bernard~P.",
  title        = "Entity Structure Based Design Methodology:  {A} {LAN} Protocol Example",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 3,
  pages        = "375--383",
  month        = mar,
  keywords     = "discrete event simulation, entity structure based knowledge
    representation, knowledge-based local area network design",
  abstract     = "An application of the system entity structure is illustrated:
    a frame-like knowledge representation scheme is used to design local area
    networks (LANs).  An entity structure for a data-link-layer protocol that
    illustrates many possible applications is introduced.  The main concepts of
    the design methodology are illustrated using this example entity structure,
    and the underlying simulation environment is briefly discussed.  The
    methodology aims to facilitate evaluation of a wide family of design
    alternatives and component combinations.", 
  location     = "http://dx.doi.org/10.1109/32.4657"
}

@Article{asotfsaridcs,
  author       = "Kohler, Walter~H.",
  title        = "{A} Survey of Techniques for Synchronization and Recovery in Decentralized Computer Systems",
  journal      = surveys,
  year         = 1981,
  volume       = 13,
  number       = 2,
  pages        = "149--183",
  month        = jun,
  keywords     = "decentralized system, object model, access synchronization,
    concurrency control, crash recovery, atomic action",
  abstract     = "Two related and fundamental problems in designing
    decentralized systems which support an object model of computation are
    introduced, and proposed solution techniques are surveyed The first problem
    is synchronizing access to shared objects while allowing a high degree of
    concurrency.  The second is the recovery of objects in spite of user
    errors, application errors, or partial system failure.  The synchronization
    problem is a generalization of the concurrency control problem which arises
    in database and transaction-processing systems.  Concurrency control
    methods which use locking, timestamps, circulating permit, tickets,
    conflict analysis, and reservations are presented and compared.  The
    proposed approach to solving the recovery problem is based on a software
    structuring abstraction called the atomic action, a type of generalized
    transaction.  Requirements and techniques for implementing atomic actions
    in a decentralized environment are discussed.", 
  location     = "http://dx.doi.org/10.1145/356842.356845"
}

@Article{matvmfsn,
  author       = "Levis, Philip and Culler, David",
  title        = "Mat{\' e}: {A} Tiny Virtual Machine for Sensor Networks",
  journal      = sigplan # " (" # pot # "Tenth International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS X)",
  year         = 2002,
  volume       = 37,
  number       = 10,
  pages        = "85--95",
  month        = oct,
  keywords     = "sensor networks, virtual machines, tinyos, active networks,
    code capsules, ad-hoc routing",
  abstract     = "Composed of tens of thousands of tiny devices with very 
    limited resources (motes), sensor networks are subject to novel systems
    problems and constraints.  The large number of motes in a sensor network
    means that there will often be some failing nodes; networks must be easy to
    repopulate.  Often there is no feasible method to recharge motes, so energy
    is a precious resource.  Once deployed, a network must be reprogrammable
    although physically unreachable, and this reprogramming can be a
    significant energy cost.We present Maté, a tiny communication-centric
    virtual machine designed for sensor networks.  Maté's high-level interface
    allows complex programs to be very short (under 100 bytes), reducing the
    energy cost of transmitting new programs.  Code is broken up into small
    capsules of 24 instructions, which can self-replicate through the network.
    Packet sending and reception capsules enable the deployment of ad-hoc
    routing and data aggregation algorithms.  Maté's concise, high-level
    program representation simplifies programming and allows large networks to
    be frequently reprogrammed in an energy-efficient manner; in addition, its
    safe execution environment suggests a use of virtual machines to provide
    the user/kernel boundary on motes that have no hardware protection
    mechanisms.", 
  location     = "http://dx.doi.org/10.1145/605397.605407",
  location     = "https://sing.stanford.edu/site/publications/asplos02levis.pdf"
}

@Article{ialfic,
  author       = "Daniel~M. Yellin and Robert~E. Strom",
  title        = "{INC}: {A} Language for Incremental Computations",
  journal      = toplas,
  year         = 1991,
  volume       = 13,
  number       = 2,
  pages        = "211--236",
  month        = apr,
  keywords     = "Dynamic algorithms, finite differencing, incremental
    complexity, incremental computations, graph representations, data-flow
    computations, static complexity", 
  abstract     = "An incremental computation is one that is performed
    repeatedly on nearly identical inputs.  Incremental computations occur
    naturally in many environments, such as compilers, language-based editors,
    spreadsheets, and formatters.  This article describes a proposed tool for
    making it easy to write incremental programs.  The tool consists of a
    programming language, INC, and a set of compile-time transformations for
    the primitive elements of INC.  A programmer defines an algorithm in INC
    without regard to efficient incremental execution.  The transformations
    automatically convert this algorithm into an efficient incremental
    algorithm.  INC is a functional language.  The implementation of an INC
    program is a network of processes.  Each INC function is transformed into a
    process that receives and transmits messages describing changes, to its
    inputs and outputs.  We give an overview to the language and illustrate the
    incremental techniques employed by INC.  We present the static and
    incremental complexity bounds for the primitive INC functions.  We also
    present some example programs illustrating INC'S flexibility.", 
  location     = "http://dx.doi.org/10.1145/53990.54002"
}

@Article{tpohnlcp,
  author       = "Mayer, Richard~E.",
  title        = "The Psychology of How Novices Learn Computer Programming",
  journal      = surveys,
  year         = 1981,
  volume       = 13,
  number       = 1,
  pages        = "121--141",
  month        = mar,
  keywords     = "psychology, programming, novices, instruction, man-machine
    interface, concrete models, restatement, pedagogy",
  abstract     = "This paper examines the current state of knowledge concerning
    how to increase the novice's understanding of computers and computer
    programming.  In particular, it reviews how advances in cognitive and
    educational psychology may be applied to problems in teaching
    non-programmers how to use computers.  Two major instructional techniques
    are reviewed: providing a concrete model of the computer and encouraging
    the learners to actively put technical information into their own words.", 
  location     = "http://dx.doi.org/10.1145/356835.356841"
}

@Article{erfas,
  author       = "Sivathanu, Muthian and Arpaci-Dusseau, Andrea~C. and Arpaci-Dusseau, Remzi~H.",
  title        = "Evolving {RPC} for Active Storage",
  journal      = sigplan # " (" # pot # "Tenth International Conference on Architectural Support for Programming Languages and Operating Systems (ASPLOS X))",
  year         = 2002,
  volume       = 37,
  number       = 10,
  pages        = "264--276",
  month        = oct,
  keywords     = "rpc, file servers, sprite, scripting",
  abstract     = "We introduce Scriptable RPC (SRPC), an RPC-based framework
    that enables distributed system services to take advantage of active
    components.  Technology trends point to a world where each component in a
    system (whether disk, network interface, or memory) has substantial
    computational capabilities; however, traditional methods of building
    distributed services are not designed to take advantage of these new
    architectures, mandating wholesale change of the software base to exploit
    more powerful hardware.  In contrast, SRPC provides a direct and simple
    migration path for traditional services into the active environment.We
    demonstrate the power and flexibility of the SRPC framework through a
    series of case studies, with a focus on active storage servers.
    Specifically, we find three advantages to our approach.  First, SRPC
    improves the performance of distributed file servers, reducing latency by
    combining the execution of operations at the file server.  Second, SRPC
    enables the ready addition of new functionality; for example, more powerful
    cache consistency models can be realized on top of a server that exports a
    simple NFS-like interface.  Third, SRPC simplifies the construction of
    distributed services; operations that are difficult to coordinate across
    client and server can now be co-executed at the server, thus avoiding
    costly agreement and crash-recovery protocols.",
  location     = "http://dx.doi.org/10.1145/635506.605425"
}

@Article{ascfcea,
  author       = "Gordon, Michael~I. and Thies, William and Karczmarek, Michal and Lin, Jasper and Meli, Ali~S. and Lamb, Andrew~A. and Leger, Chris and Wong, Jeremy and Hoffmann, Henry and Maze, David and Amarasinghe, Saman",
  title        = "A Stream Compiler for Communication-Exposed Architectures",
  journal      = sigplan # " (" # pot # "Tenth International Conference on Architectural Support for Programming Languages and Operating Systems (ASPLOS X))",
  year         = 2002,
  volume       = 37,
  number       = 10,
  pages        = "291--303",
  month        = oct,
  keywords     = "stream processing",
  abstract     = "With the increasing miniaturization of transistors, wire
    delays are becoming a dominant factor in microprocessor performance.  To
    address this issue, a number of emerging architectures contain replicated
    processing units with software-exposed communication between one unit and
    another (e.g., Raw, SmartMemories, TRIPS).  However, for their use to be
    widespread, it will be necessary to develop compiler technology that
    enables a portable, high-level language to execute efficiently across a
    range of wire-exposed architectures.In this paper, we describe our compiler
    for StreamIt: a high-level, architecture-independent language for streaming
    applications.  We focus on our backend for the Raw processor.  Though
    StreamIt exposes the parallelism and communication patterns of stream
    programs, some analysis is needed to adapt a stream program to a
    software-exposed processor.  We describe a partitioning algorithm that
    employs fission and fusion transformations to adjust the granularity of a
    stream graph, a layout algorithm that maps a stream graph to a given
    network topology, and a scheduling strategy that generates a fine-grained
    static communication pattern for each computational element.We have
    implemented a fully functional compiler that parallelizes StreamIt
    applications for Raw, including several load-balancing transformations.
    Using the cycle-accurate Raw simulator, we demonstrate that the StreamIt
    compiler can automatically map a high-level stream abstraction to Raw
    without losing performance.  We consider this work to be a first step
    towards a portable programming model for communication-exposed
    architectures.", 
  location     = "http://dx.doi.org/10.1145/635506.605425",
  location     = "http://groups.csail.mit.edu/cag/streamit/papers/streamit-asplos.pdf"
}

@Article{harcfhm,
  author       = "Mueller, Robert~A. and Duda, Michael~R. and Sweany, Philip~H. and Walicki, Jack~S.",
  title        = "Horizon: {A} Retargetable Compiler for Horizontal Microarchitectures",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 5,
  pages        = "575--583",
  month        = may,
  keywords     = "data antidependency, data dependency, loop pipelining,
    microcode compaction, microprogramming, retargetable microcode compilers,
    trace scheduling",
  abstract     = "The vertical migration of complex application code into
    horizontal microcode makes traditional methods of handwritten and
    hand-optimized microcode with primitive assembly languages impractical.
    Higher-level languages that permit abstraction from low-level timing and
    concurrency details are considered a major step toward alleviating the
    problem.  This approach is feasible only if compilers for these languages
    exist that can produce high-quality microcode and that can be targeted to
    new machines with modest effort and high reliability.  An overview is
    provided of the Horizon retargetable microcode compiler, which facilitates
    the production of highly optimized microcode and the targeting of the
    compiler to specific machines.", 
  location     = "http://dx.doi.org/10.1109/32.6135"
}

@Article{ejas,
  author       = "Solworth, Jon~A.",
  title        = "Epochs",
  journal      = toplas,
  year         = 1992,
  volume       = 14,
  number       = 1,
  pages        = "28--53",
  month        = jan,
  keywords     = "algorithms, design, languages, theory, verification, multiple
    data stream architecture, process management, concurrent programming",
  abstract     = "To date, the implementation of message passing languages has
    required the communications variables (sometimes called ports) either to be
    limited to the number of physical communications registers in the machine
    or to be mapped to memory.  Neither solution is satisfactory.  Limiting the
    number of variables decreases modularity and efficiency of parallel
    programs.  Mapping variables to memory increases the cost of communications
    and the granularity of parallelism.  We present here a new programming
    language construct called epochs.Epochs are a scoping mechanism within
    which the programmer can declare communications variables, which are live
    only during the scope of that epoch.  To limit the range of time a register
    has to be allocated for a communications variable, the compiler ensures
    that all processors enter an epoch simultaneously.  The programming style
    engendered fits somewhere between the SIMD data parallel and the MIMD
    process spawning models. We describe an implementation for epochs including
    an efficient synchronization mechanism, a means of statically binding
    registers to communications variables, and a method of fusing epochs to
    reduce synchronization overhead.", 
  location     = "http://dx.doi.org/10.1145/111186.116785"
}

@Article{daiogftnclr,
  author       = "Kennedy, Andrew and Syme, Don",
  title        = "Design and Implementation of Generics for the .{NET} Common Language Runtime",
  journal      = sigplan # " (" # pldai01 # ")",
  year         = 2001,
  volume       = 36,
  number       = 5,
  pages        = "1--12",
  month        = may,
  keywords     = "generics, virtual machines, polymorphism",
  abstract     = "The Microsoft.NET Common Language Runtime provides a shared
    type system, intermediate language and dynamic execution environment for
    the implementation and inter-operation of multiple source languages.  In
    this paper we extend it with direct support for parametric polymorphism
    (also known as generics), describing the design through examples written in
    an extended version of the C# programming language, and explaining aspects
    of implementation by reference to a prototype extension to the runtime.
    Our design is very expressive, supporting parameterized types, polymorphic
    static, instance and virtual methods, F-bounded type parameters,
    instantiation at pointer and value types, polymorphic recursion, and exact
    run-time types.  The implementation takes advantage of the dynamic nature
    of the runtime, performing just-in-time type specialization,
    representation-based code sharing and novel techniques for efficient
    creation and use of run-time types.  Early performance results are
    encouraging and suggest that programmers will not need to pay an overhead
    for using generics, achieving performance almost matching hand-specialized
    code.",
  location     = "http://dx.doi.org/10.1145/378795.378797"
}

@Article{tedotfdam,
  author       = "Boute, Raymond~T.",
  title        = "The {Euclidean} Definition of the Functions {\tt div} and {\tt mod}",
  journal      = toplas,
  year         = 1992,
  volume       = 14,
  number       = 2,
  pages        = "127--144",
  month        = apr,
  keywords     = "desgn, standardization, theory, div function, decimation,
    euclid's theorem, hardware description, integer division, interpolation,
    mod function, number representation, predefined functions, remainder,
    residue, sampling", 
  abstract     = "The definitions of the functions div and mod in the computer
    science literature and in programming languages are either similar to the
    Algol of Pascal definition (which is shown to be an unfortunate choice) or
    based on division by truncation (T-definition) or division by flooring as
    defined by Knuth (F-definition).  The differences between various
    definitions that are in common usage are discussed, and an additional one
    is proposed, which is based on Euclid's theorem and therefore is called the
    Euclidean definition (E-definition).  Its distinguishing feature is that 0
    &#8804; D mod d &lt; | d | irrespective of the signs of D and d.  It is
    argued that the E- and F-definitions are superior to all other ones in
    regularity and useful mathematical properties and hence deserve serious
    consideration as the standard convention at the applications and language
    level.  It is also shown that these definitions are the most suitable ones
    for describing number representation systems and the realization of
    arithmetic operations at the architecture and hardware level.", 
  location     = "http://dx.doi.org/10.1145/128861.128862"
}

@Article{vsfeds,
  author       = "Dittrich, Klaus~R. and Lorie, Raymond~A.",
  title        = "Version Support for Engineering Database Systems",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 4,
  pages        = "429--437",
  month        = apr,
  keywords     = "computer-aided design, databases, version control, object
    structures, versioned databases",
  abstract     = "In engineering applications, multiple copies of object
    descriptions have to coexist in a single database.  This paper proposes a
    scheme that enables users to explicitly deal with these object versions.
    After introducing a basic version model, the problem of rerouting
    interobject references upon the creation of new versions is solved by
    providing generic references and user-specific environments.  Finally,
    logical version clusters are introduced that allow for the meaningful
    grouping of versions.  The paper concludes with some remarks on
    implementation and a comparison with other approaches.", 
  location     = "http://dx.doi.org/10.1109/32.4664"
}

@Article{cmajs,
  author       = "Alan Jay Smith",
  title        = "Cache Memories",
  journal      = surveys,
  year         = 1982,
  volume       = 14,
  number       = 3,
  pages        = "473--530",
  month        = sep,
  keywords     = "design, experimentation, measurement, performance, buffer
    memory, paging, prefetching, tlb,  store-through, amdah1470, ibm 3033,
    bias",
  abstract     = "Cache memories are used in modern, medium and high-speed CPUs
    to hold temporarily those portions of the contents of main memory which are
    (believed to be) currently in use.  Since instructions and data in cache
    memories can usually be referenced in 10 to 25 percent of the time required
    to access main memory, cache memories permit the execution rate of the
    machine to be substantially increased.  In order to function effectively,
    cache memories must be carefully designed and implemented.  In this paper,
    we explain the various aspects of cache memories and discuss in some detail
    the design features and trade-offs.  A large number of original,
    trace-driven simulation results are presented.  Consideration is given to
    practical implementation questions as well as to more abstract design
    issues.  Specific aspects of cache memories that are investigated include:
    the cache fetch algorithm (demand versus prefetch), the placement and
    replacement algorithms, line size, store-through versus copy-back updating
    of main memory, cold-start versus warm-start miss ratios, multicache
    consistency, the effect of input/output through the cache, the behavior of
    split data/instruction caches, and cache size.  Our discussion includes
    other aspects of memory system architecture, including translation
    lookaside buffers.  Throughout the paper, we use as examples the
    implementation of the cache in the Amdahl 470V/6 and 470V/7, the IBM 3081,
    3033, and 370/168, and the DEC VAX 11/780.  An extensive bibliography is
    provided.", 
  location     = "http://dx.doi.org/10.1145/356887.356892"
}

@Article{ewasdma,
  author       = "Wall, David~W.",
  title        = "Experience with a Software-Defined Machine Architecture",
  journal      = toplas,
  year         = 1992,
  volume       = 14,
  number       = 3,
  pages        = "299-338",
  month        = jul,
  keywords     = "graph coloring, intermediate language, interprocedural
    optimization, pipline scheduling, profiling, register allocation, register
    windows, risc, link-time manipulations",
  abstract     = "We have built a system in which the compiler back end and the
    linker work together to present an abstract machine at a considerably
    higher level than the actual machine.  The intermediate language translated
    by the back end is the target language of all high-level compilers and is
    also the only assembly language generally available.  This lets us do
    intermodule register allocation, which would be harder if some of the code
    in the program had come from a traditional assembler, out of sight of the
    optimizer.  We do intermodule register allocation and pipeline instruction
    scheduling at link time, using information gathered by the compiler back
    end.  The mechanism for analyzing and modifying the program at link time is
    also useful in a wide array of instrumentation tools.", 
  location     = "http://dx.doi.org/10.1145/129393.129395"
}

@Article{eiof,
  author       = "Ryder, Barbara~G. and Pendergrast, J.~Stephen",
  title        = "Experiments in Optimizing {FP}",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 4,
  pages        = "444-454",
  month        = apr,
  keywords     = "coupling, fp, functional programming, optimization,
  intermediate representation",
  abstract     = "FPOPT, a globally optimizing compiler for FP, was built to 
    study the efficiency of compiling a functional programming language by
    translating it into an intermediate language and then optimizing that
    intermediate language.  This paper describes the FPOPT system, the design
    of the intermediate language and the optimizations performed.  We have
    compared the relative effectiveness of these optimizations, singly and in
    combinations, using an instrumented version of FPOPT; we report our
    findings here.", 
  location     = "http://dx.doi.org/10.1109/32.4668"
}

@Article{apaocp,
  author       = "Ball, Thomas and Majumdar, Rupak and Millstein, Todd and Rajamani, Sriram~K.",
  title        = "Automatic Predicate Abstraction of {C} Programs",
  journal      = sigplan # " (" # pldai01 # ")",
  year         = 2001,
  volume       = 36,
  number       = 5,
  pages        = "203--213",
  month        = may,
  keywords     = "model checking, theorem checking",
  abstract     = "Model checking has been widely successful in validating and
    debugging designs in the hardware and protocol domains.  However,
    state-space explosion limits the applicability of model checking tools, so
    model checkers typically operate on abstractions of systems.  Recently,
    there has been significant interest in applying model checking to software.
    For infinite-state systems like software, abstraction is even more
    critical.  Techniques for abstracting software are a prerequisite to making
    software model checking a reality.  We present the first algorithm to
    automatically construct a predicate abstraction of programs written in an
    industrial programming language such as C, and its implementation in a tool
    &mdash; C2BP.  The C2BP tool is part of the SLAM toolkit, which uses a
    combination of predicate abstraction, model checking, symbolic reasoning,
    and iterative refinement to statically check temporal safety properties of
    programs.  Predicate abstraction of software has many applications,
    including detecting program errors, synthesizing program invariants, and
    improving the precision of program analyses through predicate sensitivity.
    We discuss our experience applying the C2BP predicate abstraction tool to a
    variety of problems, ranging from checking that list-manipulating code
    preserves heap invariants to finding errors in Windows NT device drivers.", 
  location     = "http://dx.doi.org/10.1145/378795.378846"
}

@Article{tcwasbtftvocs,
  author       = "Cleaveland, Rance and Parrow, Joachim and Steffen, Bernhard",
  title        = "The {C}oncurrency {W}orkbench:  {A} Semantics-Based Tool for the Verification of Concurrent Systems",
  journal      = toplas,
  year         = 1993,
  volume       = 15,
  number       = 1,
  pages        = "36--72",
  month        = jan,
  keywords     = "automatic verification, concurrency, finite-state systems,
  concurrency workbench, process algebra",
  abstract     = "The Concurrency Workbench is an automated tool for analyzing
    networks of finite-state processes expressed in Milner's Calculus of
    Communicating Systems.  Its key feature is its breadth: a variety of
    different verification methods, including equivalence checking, preorder
    checking, and model checking, are supported for several different process
    semantics.  One experience from our work is that a large number of
    interesting verification methods can be formulated as combinations of a
    small number of primitive algorithms.  The Workbench has been applied to
    the verification of communications protocols and mutual exclusion
    algorithms and has proven a valuable aid in teaching and research.", 
  location     = "http://dx.doi.org/10.1145/151646.151648"
}

@Article{alasftcatopp,
  author       = "Schwan, Karsten and Ramnath, Rajiv and Vasudevan, Sridhar and Ogle, David",
  title        = "{A} Language and System for the Construction and Tuning of Parallel Programs",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 4,
  pages        = "455--471",
  month        = apr,
  keywords     = "monitoring, objects, parallel programming, programming
    environment, program views, tuning, adaptation",
  abstract     = "The programming of efficient parallel software typically
    requires extensive experimentation with program prototypes.  To facilitate
    such experimentation, any programming system that supports rapid
    prototyping of parallel programs should provide high-level language
    primitives with which programs can be explicitly, statically, or
    dynamically tuned with respect to performance and reliability.  When using
    such primitives, programmers should not need to interact explicitly or even
    be aware of the different software tools involved in program construction
    and tuning, such as compilers, linkers, and loaders.  In addition, such
    language primitives should be able to refer conveniently to the information
    about the executing program and the parallel hardware required for tuning.
    Such information may include monitoring data about the current or previous
    program or even hints regarding appropriate tuning decisions.  Language
    primitives and an associated programming system for program tuning are
    presented in this paper.  The primitives and system have been implemented,
    and have been tested with several parallel applicationson a network of
    UNIX workstations.", 
  location     = "http://dx.doi.org/10.1109/32.4669"
}

@Article{srfcvfs,
  author       = "Hansen, Wilfred~J.",
  title        = "Subsequence References:  First-Class Values for Substrings",
  journal      = toplas,
  year         = 1992,
  volume       = 14,
  number       = 4,
  pages        = "471--489",
  month        = oct,
  keywords     = "andrew toolkit, atk, auis, document processing, ness,
    programming language design, sequences, strings, string searching,
    subsequences, substrings",
  abstract     = "Arrays of characters are a basic data type in many
    programming languages, but strings and substrings are seldom accorded
    first-class status as parameters and return values.  Such status would
    enable a routine that calls a search function to readily access context on
    both sides of a return value.  To enfranchise substrings, this paper
    describes a new data type for substrings as a special case of one for
    general subsequences.  The key idea is that values are not sequences or
    references to positions in sequences, but rather references to
    subsequences.  Primitive operations on the data type are constants,
    concatenation, and four new functions&mdash;base, start, next, and
    extent&mdash;which map subsequence references to subsequence references.
    This paper informally presents the data type, demonstrates its convenience
    for defining search functions, and shows how it can be concisely
    implemented.  Examples are given in Ness, a language incorporating the new
    data type, which is implemented as part of the Andrew User Interface
    System.",
  location     = "http://dx.doi.org/10.1145/133233.133234"
}

@Article{asccfds,
  author       = "Katz, Shmuel",
  title        = "{A} Superimposition Control Construct for Distributed Systems",
  journal      = toplas,
  year         = 1993,
  volume       = 15,
  number       = 2,
  pages        = "337--356",
  month        = apr,
  keywords     = "distributed programming, control construct, formal and actual
    processes, modularity, roletype, superimposition",
  abstract     = "A control structure called a superimposition is proposed.
    The structure contains schematic abstractions of processes called roletypes
    in its declaration.  Each roletype may be bound to processes from a basic
    distributed algorithm, and the operations of the roletype will then execute
    interleaved with those of the basic processes, over the same state space.
    This structure captures a kind of modularity natural for distributed
    programming, which previously has been treated using a macro-like
    implantation of code.  The elements of a superimposition are identified, a
    syntax is suggested, correctness criteria are defined, and examples are
    presented.", 
  location     = "http://dx.doi.org/10.1145/169701.169682"
}

@Article{potodr,
  author       = "Haerder, Theo and Reuter, Andreas",
  title        = "Principles of Transaction-Oriented Database Recovery",
  journal      = surveys,
  year         = 1983,
  volume       = 15,
  number       = 4,
  pages        = "287--317",
  month        = dec,
  keywords     = "reliability, fault tolerance, database management, recovery
    and restart, transaction processing, database administration, logging and
    recovery, acid, checkpoints",
  abstract     = "In this paper, a terminological framework is provided for
    describing different transaction-oriented recovery schemes for database
    systems in a conceptual rather than an implementation-dependent way.  By
    introducing the terms materialized database, propagation strategy, and
    checkpoint, we obtain a means for classifying arbitrary implementations
    from a unified viewpoint.  This is complemented by a classification scheme
    for logging techniques, which are precisely defined by using the other
    terms.  It is shown that these criteria are related to all relevant
    questions such as speed and scope of recovery and amount of redundant
    information required.  The primary purpose of this paper, however, is to
    establish an adequate and precise terminology for a topic in which the
    confusion of concepts and implementational aspects still imposes a lot of
    problems.", 
  location     = "http://dx.doi.org/10.1145/289.291"
}

@Article{ufaaucamloccias,
  author       = "Heintze, Nevin and Tardieu, Olivier",
  title        = "Ultra-fast Aliasing Analysis using {CLA}:  {A} Million Lines of {C} code in a Second",
  journal      = sigplan # " (" # pldai01 # ")",
  year         = 2001,
  volume       = 36,
  number       = 5,
  pages        = "254--263",
  month        = may,
  abstract     = "We describe the design and implementation of a system for
    very fast points-to analysis.  On code bases of about million lines of
    unpreprocessed C code, our system performs field-based Andersen-style
    points-to analysis in less than a second and uses less than 10MB of memory.
    Our two main contributions are a database-centric analysis architecture
    called compile-link-analyze (CLA), and a new algorithm for implementing
    dynamic transitive closure.  Our points-to analysis system is built into a
    forward data-dependence analysis tool that is deployed within Lucent to
    help with consistent type modifications to large legacy C code bases.", 
  keywords     = "type checking, dependence analysis, points-to analysis,
    reachability, program analysis, transitive closure",
  location     = "http://dx.doi.org/10.1145/378795.378855"
}

@Article{osfcmwfr,
  author       = "Appel, Andrew~W. and George, Lal",
  title        = "Optimal Spilling for {CISC} Machines with Few Registers",
  journal      = sigplan # " (" # pldai01 # ")",
  year         = 2001,
  volume       = 36,
  number       = 5,
  pages        = "243--253",
  month        = may,
  abstract     = "Many graph-coloring register-allocation algorithms don't work
    well for machines with few registers.  Heuristics for live-range splitting
    are complex or suboptimal; heuristics for register assignment rarely factor
    the presence of fancy addressing modes; these problems are more severe the
    fewer registers there are to work with.  We show how to optimally split
    live ranges and optimally use addressing modes, where the optimality
    condition measures dynamically weighted loads and stores but not
    register-register moves.  Our algorithm uses integer linear programming but
    is much more efficient than previous ILP-based approaches to register
    allocation.  We then show a variant of Park and Moon's optimistic
    coalescing algorithm that does a very good (though not provably optimal)
    job of removing the register-register moves.  The result is Pentium code
    that is 9.5% faster than code generated by SSA-based splitting with
    iterated register coalescing.",
  keywords     = "integer linear programming, register assignment, register
    spilling, register coalescing",
  location     = "http://dx.doi.org/10.1145/381694.378854",
  location     = "https://www.cs.princeton.edu/~appel/papers/spill.pdf"
}

@Article{iitam,
  author       = "Angluin, Dana and Smith, Carl~H.",
  title        = "Inductive Inference: Theory and Methods",
  journal      = surveys,
  year         = 1983,
  volume       = 15,
  number       = 3,
  pages        = "237--269",
  month        = sep,
  keywords     = "computation by abstract devices, artificial intelligence,
    automatic programming, program synthesis, learning, induction, algorithms,
    theory inductive inference, learning by example", 
  abstract     = "There has been a great deal of theoretical and experimental
    work in computer science on inductive inference systems, that is, systems
    that try to infer general rules from examples.  However, a complete and
    applicable theory of such systems is still a distant goal.  This survey
    highlights and explains the main ideas that have been developed in the
    study of inductive inference, with special emphasis on the relations
    between the general theory and the specific algorithms and
    implementations.", 
  location     = "http://dx.doi.org/10.1145/356914.356918"
}

@Article{amovc,
  author       = "Wolf, Alexander~L. and Clarke, Lori~A. and Wileden, Jack~C.",
  title        = "{A} Model of Visibility Control",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 4,
  pages        = "512--520",
  month        = apr,
  keywords     = "computer languages, module interface control, scope,
    visibility, algol60, smalltalk80, pic",
  abstract     = "A number of mechanisms have been created for controlling
    entity visibility.  As with most language concepts in computer science,
    visibility control mechanisms have been developed in an essentially ad hoc
    fashion, with no clear indication given by their designers as to how one
    proposed mechanism relates to another.  This paper introduces a formal
    model for describing and evaluating visibility control mechanisms.  The
    model reflects a general view of visibility in which the concepts of
    requisition of access and provision of access are distinguished.This model
    provides a means for characterizing and reasoning about the various
    properties of visibility control mechanisms.  Specifically, a notion of
    preciseness is defined in this paper.  The utility of the model is
    illustrated by using it to evaluate and compare the relative strengths and
    weaknesses, with respect to preciseness, of the visibility control
    mechanisms found in Algol60, Ada, Gypsy, and an approach we have developed,
    called PIG, that specifically addresses the concerns of visibility control
    in large software systems.", 
  location     = "http://dx.doi.org/10.1109/32.4673"
}

@Article{plbpm,
  author       = "Teodor Rus",
  title        = "Parsing Languages by Pattern Matching",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 4,
  pages        = "498--511",
  month        = apr,
  keywords     = "algebraic model, algorithm, bnf-rule, compiler, complexity,
    language, pattern matching, program evaluation, programming language,
    program parsing, specification mechanism",
  abstract     = "The language of universal algebras is used as an alternative
    approach for programming language specification.  BNF rules are employed
    for specifying the signature of the language algebra instead of the context
    free syntax.  The algorithm for program parsing is inductively defined by
    the following universal algebraic construction: Any function defined on the
    generators of a free algebra taking values in the carrier of another
    similar algebra can he uniquely extended to a homomorphism between the two
    algebras.  Any conventional programming language can be specified by a
    finite set of BNF rules and its algebra of symbols is generated by a finite
    set of generator classes.  Thus any function defined on the finite set of
    generators offers an algebraic mechanism for a universal algorithm for
    source language program parsing.  The right-hand side of the BNF rules are
    the patterns searched by the algorithm in the source text of the program.
    The essential feature of this algorithm is that it can be used as a driver
    for code generation and optimization in a translator.  This driver
    recognizes source language constructs in the source text.  The code
    generator evaluates them into the target language regenerating the source
    language program inductively as a target language program.  Therefore this
    parser is also called a program evaluator.", 
  location     = "http://dx.doi.org/10.1109/32.4672"
}

@Article{tcapsecisc,
  author       = "Patricia~A. Oberndorf",
  title        = "The {C}ommon {A}da {P}rogramming {S}upport {E}nvironment ({CAPSE}) {I}nterface {S}et ({CAIS})",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 6,
  pages        = "742-748",
  month        = jun,
  keywords     = "operating systems, transportability, interface design, tool
    suites", 
  abstract     = "The Common APSE Interface Set (CAIS) is discussed, along with
    its relationship to issues in the development of environments.  The CAIS
    concepts and features are described, followed by a discussion of several
    ways in which the CAIS provides valuable capabilities for environment
    architectures and construction", 
  location     = "http://dx.doi.org/10.1109/32.6154"
}

@Article{dvdrh,
  author       = "Hanson, David~R. and Proebsting, Todd~A.",
  title        = "Dynamic Variables",
  journal      = sigplan # " (" # pldai01 # ")",
  year         = 2001,
  volume       = 36,
  number       = 5,
  pages        = "264--273",
  month        = may,
  keywords     = "dynamic variables, control structures, variable scope,
    software engineering",
  abstract     = "Most programming languages use static scope rules for
    associating uses of identifiers with their declarations.  Static scope
    helps catch errors at compile time, and it can be implemented efficiently.
    Some popular languages&mdash;Perl, Tel, TeX, and Postscript&mdash;offer
    dynamic scope, because dynamic scope works well for variables that
    &ldquo;customize&rdquo; the execution environment, for example.
    Programmers must simulate dynamic scope to implement this kind of usage in
    statically scoped languages.  This paper describes the design and
    implementation of imperative language constructs for introducing and
    referencing dynamically scoped variables&mdash;dynamic variables for short.
    The design is a minimalist one, because dynamic variables are best used
    sparingly, much like exceptions.  The facility does, however, cater to the
    typical uses for dynamic scope, and it provides a cleaner mechanism for
    so-called thread-local variables.  A particularly simple implementation
    suffices for languages without exception handling.  For languages with
    exception handling, a more efficient implementation builds on existing
    compiler infrastructure.  Exception handling can be viewed as a control
    construct with dynamic scope.  Likewise, dynamic variables are a data
    construct with dynamic scope.", 
  location     = "https://www.microsoft.com/en-us/research/publication/dynamic-variables/",
  location     = "http://dx.doi.org/10.1145/378795.378857"
}

@Article{apwe,
  author       = "Mcbride, Conor and Paterson, Ross",
  title        = "Applicative Programming with Effects",
  journal      = jfp,
  year         = 2008,
  volume       = 18,
  number       = 1,
  pages        = "1--13",
  month        = jan,
  keywords     = "applicative class, monad, data structure traversal,
    applicative functors, arrows",
  abstract     = "In this article, we introduce Applicative functors - an 
    abstract characterisation of an applicative style of effectful programming,
    weaker than Monads and hence more widespread.  Indeed, it is the ubiquity
    of this programming pattern that drew us to the abstraction.  We retrace
    our steps in this article, introducing the applicative pattern by diverse
    examples, then abstracting it to define the Applicative type class and
    introducing a bracket notation that interprets the normal application
    syntax in the idiom of an Applicative functor.  Furthermore, we develop the
    properties of applicative functors and the generic operations they support.
    We close by identifying the categorical structure of applicative functors
    and examining their relationship both with Monads and with Arrow.", 
  location     = "http://staff.city.ac.uk/~ross/papers/Applicative.ps.gz",
  location     = "http://dx.doi.org/10.1017/S0956796807006326"
}

@Article{afdopic,
  author       = "Fidge, Colin~J.",
  title        = "{A} Formal Definition of Priority in {CSP}",
  journal      = toplas,
  year         = 1993,
  volume       = 15,
  number       = 4,
  pages        = "681--705",
  month        = sep,
  keywords     = "csp, trace semantics, priority, concurrency, semantics",
  abstract     = "The process models of Ada and occam are formally based on the
    CSP process algebra.  However, for fine-tuning real-time performance, they
    include &ldquo;prioritized&rdquo; constructs that have no counterparts in
    CSP.  These constructs therefore lack any formal definition, a situation
    that leaves room for misunderstandings.  We extend CSP with a formal
    definition of the notion of priority.  The definition is then used to
    assess the transputer implementation of priority in occam and the
    definition of priority in Ada.", 
  location     = "http://dx.doi.org/10.1145/155183.155221"
}

@Article{seaauif,
  author       = "Young, Michal and Taylor, Richard~N. and Troup, Dennis~B.",
  title        = "Software Environment Architectures and User Interface Facilities",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 6,
  pages        = "697--708",
  month        = jun,
  keywords     = "environments, interactive program structures, user interface
    management systems",
  abstract     = "The authors discuss the demands and constraints on a user
    interface management system for a software environment, and the relation
    between the architecture of the environment and the user interface
    management system.  A model for designing user interface management systems
    for large extensible environments is presented.  This model synthesizes
    several recent advances in user interfaces and specializes them to the
    domain of software environments.  The model can be applied to a wide
    variety of environment contexts.  A prototype implementation is
    described.", 
  location     = "http://dx.doi.org/10.1109/32.6151"
}

@Article{tcpdsfse,
  author       = "Hudson, Scott~E. and King, Roger",
  title        = "The {C}actis Project: Database Support for Software Environments",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 6,
  pages        = "709--710",
  month        = jun,
  keywords     = "database management systems, software environments, data
    model", 
  abstract     = "The Cactis project is an on-going effort oriented toward
    extending database support from traditional business-oriented applications
    to software environments.  The main goals of the project are to construct
    an appropriate model, and develop new techniques to support the unusual
    data management needs of software environments, including program
    compilations, software configurations, load modules, project schedules,
    software versions, nested and long transactions, and program
    transformations.  The ability to manage derived information is common to
    many of these data needs, and the Cactis database management system has the
    ability to represent and maintain derived data in a time- and
    space-efficient fashion.  A central contribution of Cactis is its
    integration of the type constructors of semantic models and the localized
    behavior capabilities of object-oriented database management systems.", 
  location     = "http://dx.doi.org/10.1109/32.6152"
}

@Article{mapatcc,
  author       = "Kurose, James~F. and Schwartz, Mischa and Yemini, Yechiam",
  title        = "Multiple-Access Protocols and Time-Constrained Communication",
  journal      = surveys,
  year         = 1984,
  volume       = 16,
  number       = 1,
  pages        = "43--70",
  month        = mar,
  keywords     = "computer networks, multiple-access protocols, real-time
    connumication, time-constrained communication, channel-allocation
    protocols, contention-based protocols, protocol evaluation, protocol
    capacity, time delay, throughput",
  abstract     = "During the past ten years, the field of multiple-access
    communication has developed into a major area of both practical and
    theoretical interest within the field of computer communications.  The
    multiple-access problem arises from the necessity of sharing a single
    communication channel among a community of distributed users.  The
    distributed algorithm used by the stations to share the channel is known as
    the multiple-access protocol.  In this paper we examine the multiple-access
    problem and various approaches to its resolution.  In this survey we first
    define the multiple-access problem and then present the underlying issues
    and difficulties in achieving multiple-access communication.  A taxonomy
    for multiple-access protocols is then developed in order to characterize
    common approaches and to provide a framework within which these protocols
    can be compared and contrasted.  Different proposed protocols are then
    described and discussed, and aspects of their performance are examined.
    The use of multiple-access protocols for real- time or time-constrained
    communication applications, such as voice transmission, is examined next.
    Issues in time-constrained communication are identified, and recent work in
    the design of time-constrained multiple-access protocols is surveyed.", 
  location     = "http://dx.doi.org/10.1145/861.870"
}

@Article{canfcp,
  author       = "Andrews, Gregory~R. and Schneider, Fred~B.",
  title        = "Concepts and Notations for Concurrent Programming",
  journal      = surveys,
  year         = 1983,
  volume       = 15,
  number       = 1,
  pages        = "3--43",
  month        = mar,
  keywords     = "concurrent programming, concurrent language constructs,
    programming structures, coroutines, process management, language
    organization and design, fork and join, busy waiting, semaphores,
    conditional critical regions, monitors, path expressions, communication
    channels, synchronization, message passing, axiomatic semantics, ada,
    argus, gypsy, sr, ada, communicating sequential processes",
  abstract     = "Much has been learned in the last decade about concurrent
    programming.  This paper identifies the major concepts of concurrent
    programming and describes some of the more important language notations for
    writing concurrent programs.  The roles of processes, communication, and
    synchronization are discussed.  Language notations for expressing
    concurrent execution and for specifying process interaction are surveyed.
    Synchronization primitives based on shared variables and on message passing
    are described.  Finally, three general classes of concurrent programming
    languages are identified and compared.",
  location     = "http://dx.doi.org/10.1145/356901.356903"
}

@Article{dtad,
  author       = "Moret, Bernard M.~E.",
  title        = "Decision Trees and Diagrams",
  journal      = surveys,
  year         = 1982,
  volume       = 14,
  number       = 4,
  pages        = "593--623",
  month        = dec,
  keywords     = "atomic digraph, binary identification, boolean graph,
    decision program, decision table, diagnostic key, diagnostic table,
    evaluation, exhaustive function, feature selection, heuristics,
    hierarchical classifier, multiplier network, multistage testing,
    np-complete problems, sequential evaluation procedure, table splitting,
    taxonomy, test selection",
  abstract     = "Decision trees and diagrams (also known as sequential
    evaluation procedures) have widespread applications in databases, decision
    table programming, concrete complexity theory, switching theory, pattern
    recognition, and taxonomy--in short, wherever discrete functions must be
    evaluated sequentially.  In this tutorial survey a common framework of
    definitions and notation is established, the contributions from the main
    fields of application are reviewed, recent results and extensions are
    presented, and areas of ongoing and future research are discussed.", 
  location     = "http://dx.doi.org/10.1145/356893.356898"
}

@Article{trocicp,
  author       = "McIntyre, Donald~B.",
  title        = "The Role of Composition in Computer Programming",
  journal      = "APL Quote Quad" # " (" # pot # "International Conference on Applied Programming Languages, APL '95)",
  year         = 1995,
  volume       = 25,
  number       = 4,
  pages        = "116--133",
  month        = jun,
  keywords     = "executable mathematical notation, function composition,
    composite verbs, adverbs, conjunctions, trains, forks, hooks, gerunds,
    geometry, iverson, apl, j",
  abstract     = "Iverson has greatly enlarged the mathematical notion of 
    function composition and made it available to computer programmers.  This
    paper explains the concept, and uses practical examples to show how
    concise, powerful programs can be written and read.  Alternative forms are
    given, and ways of overcoming initial difficulties are explained.The
    systematic use of composition extends the well-known advantages of APL;
    namely conciseness, consistency, and generality.", 
  location     = "http://dx.doi.org/10.1145/206913.206985"
}

@Article{dsuhmn,
  author       = "Hicks, Michael and Moore, Jonathan~T. and Nettles, Scott",
  title        = "Dynamic Software Updating",
  journal      = sigplan # " (" # pldai01 # ")",
  year         = 2001,
  volume       = 36,
  number       = 5,
  pages        = "13--23",
  month        = may,
  keywords     = "software updating, patch management, dynamic patches,
    updateable systems",
  abstract     = "Many important applications must run continuously and without
    interruption, yet must be changed to fix bugs or upgrade functionality.  No
    prior general-purpose methodology for dynamic updating achieves a practical
    balance between flexibility, robustness, low overhead, and ease of use.  We
    present a new approach for C-like languages that provides type-safe dynamic
    updating of native code in an extremely flexible manner (code, data, and
    types may be updated, at programmer-determined times) and permits the use
    of automated tools to aid the programmer in the updating process.  Our
    system is based on dynamic patches that both contain the updated code and
    the code needed to transition from the old version to the new.  A novel
    aspect of our patches is that they consist of verifiable native code (e.g.
    Proof-Carrying Code [17] or Typed Assembly Language [16]), which is native
    code accompanied by annotations that allow on-line verification of the
    code's safety.  We discuss how patches are generated mostly automatically,
    how they are applied using dynamic-linking technology, and how code is
    compiled to make it updateable.  To concretely illustrate our system, we
    have implemented a dynamically-updateable web server, FlashEd.  We discuss
    our experience building and maintaining FlashEd.  Performance experiments
    show that for FlashEd, the overhead due to updating is typically less than
    1%.", 
  location     = "http://dx.doi.org/10.1145/378795.378798"
}

@Article{dpacpc,
  author       = "Per {Brinch Hensen}",
  title        = "Distributed Processes: {A} Concurrent Programming Concept",
  journal      = cacm,
  year         = 1978,
  volume       = 21,
  number       = 11,
  pages        = "934--941",
  month        = nov,
  keywords     = "concurrent programming, distributed processes, microprocessor
    networks, nondeterminism, guarded regions, programming languages, process
    communication and scheduling, sorting arrays, coroutines, classes,
    monitors, processes, semaphores, buffers, path expressions, input/output",
  abstract     = "A language concept for concurrent processes without common
    variables is introduced.  These processes communicate and synchronize by
    means of procedure calls and guarded regions.  This concept is proposed for
    real-time applications controlled by microcomputer networks with
    distributed storage.  The paper gives several examples of distributed
    processes and shows that they include procedures, coroutines, classes,
    monitors, processes, semaphores, buffers, path expressions, and
    input/output as special cases.", 
  location     = "http://brinch-hansen.net/papers/1978a.pdf",
  location     = "http://dx.doi.org/10.1145/359642.359651"
}

@Article{pga,
  author       = "Quinn, Michael~J. and Deo, Narsingh",
  title        = "Parallel Graph Algorithms",
  journal      = surveys,
  year         = 1984,
  volume       = 16,
  number       = 3,
  pages        = "319--348",
  month        = sep,
  keywords     = "systolic arrays, associative processors, processor arrays,
    multiple cpu computers, graph searching, mimd, simd, undirected graph
    connected components, connectivity algorithms, maximum clique, maximum
    cardinality matching, weighted graph parallel algorithms, minimum spanning
    tree, shortest path, tsp",
  abstract     = "Algorithms and data structures developed to solve graph
    problems on parallel computers are surveyed.  The problems discussed relate
    to searching graphs and finding connected components, maximal cliques,
    maximum cardinality matchings, minimum spanning trees, shortest paths, and
    traveling salesman tours.  The algorithms are based on a number of models
    of parallel computation, including systolic arrays, associative processors,
    array processors, and multiple CPU computers.  The most popular model is a
    direct extension of the standard RAM model of sequential computation.  It
    may not, however, be the best basis for the study of parallel algorithms.
    More emphasis has been focused recently on communications issues in the
    analysis of the complexity of parallel algorithms; thus parallel models are
    coming to be more complementary to implementable architectures.  Most
    algorithms use relatively simple data structures, such as the adjacency
    matrix and adjacency lists, although a few algorithms using linked lists,
    heaps, and trees are also discussed.",
  location     = "http://dx.doi.org/10.1145/2514.2515"
}

@Article{trboalpl,
  author       = "Herndon Jr., Robert~M. and Berzins, Valdis~A.",
  title        = "The Realizable Benefits of a Language Prototyping Language",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 6,
  pages        = "803--809",
  month        = jun,
  keywords     = "attribute grammars, languages, prototyping, software tools,
    translation", 
  abstract     = "The uses and advantages of a language tailored specifically
    for the description and construction of translators are considered.  The
    major features of the Kodiyak language prototyping language are described.
    The Kodiyak language was designed to be a comprehensive translator
    development system.  The language is intended to support a simple,
    unambiguous conceptual model of translation, to allow the construction of
    nontrivial translators, and, to be easy to use", 
  location     = "http://dx.doi.org/10.1109/32.6159"
}

@Article{sgcpfd,
  author       = "Cartey, Luke and Lyngs\o, Rune and {de Moor}, Oege",
  title        = "Synthesising Graphics Card Programs from {DSLs}",
  journal      = sigplan # " (" # pldai12 # ")",
  year         = 2012,
  volume       = 47,
  number       = 6,
  pages        = "121--132",
  month        = jun,
  keywords     = "gpu, scientific applications, program synthesis, dynamic
    programming, domain specific language, scheduling partitions, parallelising
    recursive equations, hidden markov models",
  abstract     = "Over the last five years, graphics cards have become a
    tempting target for scientific computing, thanks to unrivaled peak
    performance, often producing a runtime speed-up of x10 to x25 over
    comparable CPU solutions.  However, this increase can be difficult to
    achieve, and doing so often requires a fundamental rethink.  This is
    especially problematic in scientific computing, where experts do not want
    to learn yet another architecture.  In this paper we develop a method for
    automatically parallelising recursive functions of the sort found in
    scientific papers.  Using a static analysis of the function dependencies we
    identify sets - partitions - of independent elements, which we use to
    synthesise an efficient GPU implementation using polyhedral code generation
    techniques.  We then augment our language with DSL extensions to support a
    wider variety of applications, and demonstrate the effectiveness of this
    with three case studies, showing significant performance improvement over
    equivalent CPU methods, and similar efficiency to hand-tuned GPU
    implementations.",
  location     = "http://dx.doi.org/10.1145/2254064.2254080",
  location     = "https://www.stats.ox.ac.uk/__data/assets/pdf_file/0003/8229/Synthesising_Graphics_Card_Programs.pdf"
}

@Article{csavos,
  author       = "Jonsson, Bengt",
  title        = "Compositional Specification and Verification of Distributed Systems",
  journal      = toplas,
  year         = 1994,
  volume       = 16,
  number       = 2,
  pages        = "259--303",
  month        = mar,
  keywords     = "specification, verification, io-automata, assertional
    reasoning, compositionality, message passing, modular specification,
    specification, stepwise refinement ",
  abstract     = "We present a method for specification and verification of 
    distributed systems that communicate via asynchronous message passing.  The
    method handles both safety and liveness properties.  It is compositional,
    i.e., a specification of a composite system can be obtained from
    specifications of its components.  Specifications are given as labeled
    transition systems with fairness properties, using a program-like notation
    with guarded multiple assignments.  Compositionality is attained by
    partitioning the labels of a transition system into input events, which
    intuitively denote message receptions, and output events, which intuitively
    denote message transmissions.  A specification denotes a set of allowed
    sequences of message transmissions and receptions, in analogy with the way
    finite automata are used as acceptors of finite strings.  A lower-level
    specification implements a higher-level one.  We present a verification
    technique which reduces the problem of verifying the correctness of an
    implementation to classical verification conditions.  Safety properties are
    verified by establishing a simulation relation between transition systems.
    Liveness properties are verified using methods for proving termination
    under fairness assumptions.  Since specifications can be given at various
    levels of abstraction, the method is suitable in a development process
    where a detailed implementation is developed from an abstract specification
    through a sequence of refinement steps.  As an application of the method,
    an algorithm by Thomas for updating a distributed database is specified and
    verified.", 
  location     = "http://dx.doi.org/10.1145/174662.174665"
}

@Article{laipg,
  author       = "Heering, J. and Klint, P. and Rekers, J.",
  title        = "Lazy and Incremental Program Generation",
  journal      = toplas,
  year         = 1994,
  volume       = 16,
  number       = 3,
  pages        = "1010-1023",
  month        = may,
  keywords     = "greedy, lazy, and incremental program generation, lazy and
  incremental generation of lexical scanners, lazy and incremental generation
  of parsers, lazy and incremental compilation, program generator",
  abstract     = "Current program generators usually operate in a greedy manner
    in the sense that a program must be generated in its entirety before it can
    be used.  If generation time is scarce, or if the input to the generator is
    subject to modification, it may be better to be more cautious and to
    generate only those parts of the program that are indispensable for
    processing the particular data at hand.  We call this lazy program
    generation.  Another, closely related strategy is incremental program
    generation.  When its input is modified, an incremental generator will try
    to make a corresponding modification in its output rather than generate a
    completely new program.  It may be advantageous to use a combination of
    both strategies in program generators that have to operate in a highly
    dynamic and/or interactive environment.", 
  location     = "http://dx.doi.org/10.1145/177492.177750"
}

@Article{tdor,
  author       = "Besl, Paul~J. and Jain, Ramesh~C.",
  title        = "Three-Dimensional Object Recognition",
  journal      = surveys,
  year         = 1985,
  volume       = 17,
  number       = 1,
  pages        = "75--145",
  month        = mar,
  keywords     = "depth maps, range images, surface characterization, surface
  matching, 3-d object recognition, 3-d object reconstruction",
  abstract     = "A general-purpose computer vision system must be capable of
    recognizing three-dimensional (3-D) objects.  This paper proposes a precise
    definition of the 3-D object recognition problem, discusses basic concepts
    associated with this problem, and reviews the relevant literature.  Because
    range images (or depth maps) are often used as sensor input instead of
    intensity images, techniques for obtaining, processing, and characterizing
    range data are also surveyed.", 
  location     = "http://dx.doi.org/10.1145/4078.4081"
}

@Article{lfmacsorwcbc,
  author       = "Shan Lu and Soyeon Park and Eunsoo Seo and Yuanyuan Zhor",
  title        = "Learning from Mistakes --- {A} Comprehensive Study on Real World Concurrency Bug Characteristics",
  journal      = sigplan # " (" # pot # "13th International Conference on Architectural Support for Programming Languages and Operating Systems, ASPLOS XIII)",
  year         = 2008,
  volume       = 43,
  number       = 3,
  pages        = "329--339",
  month        = mar,
  keywords     = "concurrent programming, concurrency errors, error
    characteristics, transactional memory, multi-threading",
  abstract     = "The reality of multi-core hardware has made concurrent
    programs pervasive.  Unfortunately, writing correct concurrent programs is
    difficult.  Addressing this challenge requires advances in multiple
    directions, including concurrency bug detection, concurrent program
    testing, concurrent programming model design, etc.  Designing effective
    techniques in all these directions will significantly benefit from a deep
    understanding of real world concurrency bug characteristics.  This paper
    provides the first (to the best of our knowledge) comprehensive real world
    concurrency bug characteristic study.  Specifically, we have carefully
    examined concurrency bug patterns, manifestation, and fix strategies of 105
    randomly selected real world concurrency bugs from 4 representative server
    and client open-source applications (MySQL, Apache, Mozilla and
    OpenOffice).  Our study reveals several interesting findings and provides
    useful guidance for concurrency bug detection, testing, and concurrent
    programming language design.  Some of our findings are as follows: (1)
    Around one third of the examined non-deadlock concurrency bugs are caused
    by violation to programmers' order intentions, which may not be easily
    expressed via synchronization primitives like locks and transactional
    memories; (2) Around 34% of the examined non-deadlock concurrency bugs
    involve multiple variables, which are not well addressed by existing bug
    detection tools; (3) About 92% of the examined concurrency bugs can be
    reliably triggered by enforcing certain orders among no more than 4 memory
    accesses.  This indicates that testing concurrent programs can target at
    exploring possible orders among every small groups of memory accesses,
    instead of among all memory accesses; (4) About 73% of the examined
    non-deadlock concurrency bugs were not fixed by simply adding or changing
    locks, and many of the fixes were not correct at the first try, indicating
    the difficulty of reasoning concurrent execution by programmers.", 
  location     = "http://dx.doi.org/10.1145/1353535.1346323",
  location     = "http://pages.cs.wisc.edu/~shanlu/paper/asplos122-lu.pdf"
}

@Article{osdcama,
  author       = "Hannan, John",
  title        = "Operational Semantics-Directed Compilers and Machine Architectures",
  journal      = toplas,
  year         = 1994,
  volume       = 16,
  number       = 4,
  pages        = "1215--1247",
  month        = jul,
  keywords     = "abstract machines, pass separation, semantics-based
    compilation, partial evaluation, staging transformations, interpreters",
  abstract     = "We consider the task of automatically constructing
    intermediate-level machine architectures and compilers generating code for
    these architectures, given operational semantics for source languages.  We
    use operational semantics in the form of abstract machines given by rewrite
    systems in which the rewrite rules operate on terms representing states of
    computations.  To construct compilers and new architectures we employ a
    particular strategy called pass separation, a form of staging
    transformation, that takes a program p and constructs a pair of programs
    p1, p2 such that p(x, y) = p2(p1(x), y)) for all x,y.  If p represents an
    operational semantics for a language, with arguments x and y denoting a
    source program and its input data, then pass separation constructs programs
    p1 and p2 corresponding to a compiler and an executor.  The compiler
    translates the source language into an intermediate-level target language,
    and the executor provides the definition for this language.  Our use of
    pass separation supports the automatic definition of target languages or
    architectures, and the structure of these architectures is directed by the
    structure of the given source semantics.  These architectures resemble
    abstract machine languages found in hand-crafted compilers.  Our method is
    restricted to a limited class of abstract machines given as term-rewriting
    systems, but we argue that this class encompasses a large set of language
    definitions derived from more natural operational semantics.  We provide
    two examples of our method by constructing compilers and target
    architectures for a simple functional language and a simple imperative
    language.  Though we construct these architectures automatically, they bear
    a striking resemblance to existing architectures constructed by hand.", 
  location     = "http://dx.doi.org/10.1145/183432.183458"
}

@Article{sols,
  author       = "Hester, James~H. and Hirschberg, Daniel~S.",
  title        = "Self-Organizing Linear Search",
  journal      = surveys,
  year         = 1985,
  volume       = 17,
  number       = 3,
  pages        = "295--311",
  month        = sep,
  keywords     = "linear search, permutations, locality, optimizations",
  abstract     = "Algorithms that modify the order of linear search lists are
    surveyed.  First the problem, including assumptions and restrictions, is
    defined.  Next a summary of analysis techniques and measurements that apply
    to these algorithms is given.  The main portion of the survey presents
    algorithms in the literature with absolute analyses when available.  The
    following section gives relative measures that are applied between two or
    more algorithms.  The final section presents open questions.", 
  location     = "http://dx.doi.org/10.1145/5505.5507"
}

@Article{svitde,
  author       = "Reiss, Steven~P.",
  title        = "Software Visualization in the {D}esert Environment",
  journal      = sigplan # " (" # pot # "1998 ACM SIGPLAN-SIGSOFT Workshop on Program Analysis for Software Tools and Engineering, PASTE '98)",
  year         = 1998,
  volume       = 33,
  number       = 7,
  pages        = "59--66",
  month        = jul,
  keywords     = "system visualization, development environments, ",
  abstract     = "While software visualization has been widely used for
    navigation, its use for understanding has been much more limited.  Software
    visualizations are expensive to develop, require large amounts of
    information that is often difficult to collect, and even then, are good
    only at addressing the specific task for which they were developed.  Our
    work on software visualization in the Desert environment is aimed at making
    software visualization a viable approach to understanding.  We do this by
    providing ready access to a variety of information about the system at
    hand, a range of high-quality, high-density visualizations, and a simple
    interface that lets the programmer rapidly create new software
    visualizations for understanding problems as they arise.  In this paper we
    describe the approach we have taken.", 
  location     = "http://static.cs.brown.edu/people/spr/research/desert/desertvis.ps", 
  location     = "http://dx.doi.org/10.1145/277631.277643"
}

@Article{abagfch,
  author       = "Appel, Andrew~W.",
  title        = "Axiomatic Bootstrapping: {A} Guide for Compiler Hackers",
  journal      = toplas,
  year         = 1994,
  volume       = 16,
  number       = 6,
  pages        = "1699--1718",
  month        = nov,
  keywords     = "verification, bootstrapping, axiom systems, interpreters,
    code retargeting, system modifications",
  abstract     = "If a compiler for language L is implemented in L, then it
    should be able to compile itself.  But for systems used interactively
    commands are compiled and immediately executed, and these commands may
    invoke the compiler; so there is the question of how ever to cross-compile
    for another architecture.  Also, where the compiler writes binary files of
    static type information that must then be read in by the bootstrapped
    interactive compiler, how can one ever change the format of digested type
    information in binary files?Here I attempt an axiomatic clarification of
    the bootstrapping technique, using Standard ML of New Jersey as a case
    study.  This should be useful to implementors of any self-applicable
    interactive compiler with nontrivial object-file and runtime-system
    compatibility problems.", 
  location     = "http://dx.doi.org/10.1145/197320.197336"
}

@Article{42a43aeotus,
  author       = "Quarterman, John~S. and Silberschatz, Abraham and Peterson, James~L.",
  title        = "4.{2BSD} and 4.{3BSD} as Examples of the " # unix # " System",
  journal      = surveys,
  year         = 1985,
  volume       = 17,
  number       = 4,
  pages        = "379--418",
  month        = dec,
  keywords     = "flexibility, portability, simplicity, operating systems,
    kernel design, shells, processes, memory management, file systems, i/o
    systems, inter-process communication, user interfaces",
  abstract     = "This paper presents an in-depth examination of the 4.2 
    Berkeley Software Distribution, Virtual VAX-11 Version (4.2BSD), which is a
    version of the UNIX Time-Sharing System.  There are notes throughout on
    4.3BSD, the forthcoming system from the University of California at
    Berkeley.  We trace the historical development of the UNIX system from its
    conception in 1969 until today, and describe the design principles that
    have guided this development.  We then present the internal data structures
    and algorithms used by the kernel to support the user interface.  In
    particular, we describe process management, memory management, the file
    system, the I/O system, and communications.  These are treated in as much
    detail as the UNIX licenses will allow.  We conclude with a brief
    description of the user interface and a set of bibliographic notes.", 
  location     = "https://doi.org/10.1145/6041.6043"
}

@Article{tcsriail,
  author       = "Auerbach, Joshua~S. and Russell, James~R.",
  title        = "The {C}oncert Signature Representation: {IDL} as Intermediate Language",
  journal      = sigplan # " (" # pot # "Workshop on Interface Definition Languages, IDL '94)",
  year         = 1994,
  volume       = 29,
  number       = 8,
  pages        = "1--12",
  month        = aug,
  keywords     = "intermediate languages, marshaling, interoperability,
    constraints, contracts, interfaces",
  abstract     = "In the Concert multilanguage distributed programming system,
    interface specification is the responsibility of programming languages, not
    a separate IDL.  However, an IDL is still necessary in order to define
    equivalence between declarations in different languages.  A single
    representation is also desirable internally to economize on aspects of the
    implementation.  Consequently, Concert has an IDL as an intermediate
    language, produced by compiler front-ends and not normally manipulated by
    programmers.  It is formally separated into a contract, which defines
    interoperability and an endpoint modifier, which captures the local choice
    of representation.  Only contracts are used to define interface
    equivalence.  Our choice of what kinds of information to put in the
    contract was motivated by a desire to be minimal, thereby enabling maximum
    feasible interoperability between different expressions of the same
    abstraction in the same or different languages.", 
  location     = "https://doi.org/10.1145/185087.185095"
}

@Article{aavgl,
  author       = "John~C. Bowman and Andy Hammerlindl",
  title        = "Asymptote: {A} Vector Graphics Language",
  journal      = "TUGboat",
  year         = 2008,
  volume       = 29,
  number       = 2,
  pages        = "288--294",
  keywords     = "functions, graphics, modules, shading, paths, vector
    graphics",
  abstract     = "Asymptote is a powerful descriptive vector graphics language
    inspired by METAPOST that features robust floating-point numerics,
    automatic picture sizing, native three-dimensional graphics, and a
    C++/Java-like syntax enhanced with high-order functions.", 
  location     = "https://www.math.ualberta.ca/~bowman/publications/asyTUG.pdf"
}

@Article{aaidlfsats,
  author       = "Sankar, Sriram and Hayes, Roger",
  title        = "{ADL} --- An Interface Definition Language for Specifying and Testing Software",
  journal      = sigplan # " (" # pot # "Workshop on Interface Definition Languages, IDL '94)",
  year         = 1994,
  volume       = 29,
  number       = 8,
  pages        = "13--21",
  month        = aug,
  keywords     = "testing, specification, exception",
  abstract     = "This paper describes an interface definition language called
    ADL which extends OMG's CORBA interface definition language with formal
    specification constructs.  In addition to ADL's use in formal
    documentation, ADL's primary use is for testing software.  ADL can be
    adapted for use with most programming languages.This paper also presents an
    overview of a testing technology based on ADL and presents the highlights
    of a test-data description language (TDD) used to describe test-data.", 
  location     = ""
}

@Article{teoapvotsioctcooa,
  author       = "Hirschheim, R.~A.",
  title        = "The Effect of a Priori Views on the Social Implications of Computing:  The Case of Office Automation",
  journal      = surveys,
  year         = 1986,
  volume       = 18,
  number       = 2,
  pages        = "165--195",
  month        = jun,
  keywords     = "optimism, pessimism, realism, social effects",
  abstract     = "Office automation impact has received considerable attention
    in the literature recently.  Unfortunately, that which has appeared is
    diverse and contradictory.  The relevant literature is reviewed,
    summarized, and placed in a framework containing three positions on office
    automation impact: optimism, pessimism, and relativism.  The basic
    assumptions and empirical support for each position are noted and analyzed.
    It is proposed that these positions are based on a number of a priori views
    which guide the reporting and beliefs about technological impact.", 
  location     = "https://doi.org/10.1145/7474.7476"
}

@Article{adsmaip,
  author       = "Wang, Yu",
  title        = "A Distributed Specification Model and Its Prototyping",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 8,
  pages        = "1090--1097",
  month        = aug,
  keywords     = "boolean expressions, distributed decomposition, executable
    specification, finite-state machines, switching systems, event-driven 
    systems",
  abstract     = "A specification model is described that is based on the
    finite-state machine but is distributed.  The model allows the user to
    decompose a large system into separate views.  Each view is a complete
    system in itself, and reveals how the whole system would behave as seen
    from a certain angle.  Put together, the combined views present a complete
    picture of the whole system.  The complexity of a large centralized system
    is thus distributed and subdued.  The author offers a simple execution
    scheme for the model.  Using a high-level state-transition language called
    SXL, constructs in the model are expressed as preconditions and
    postconditions of transitions.  The execution scheme allows all the views
    in the model to proceed in a parallel but harmonious way, producing a
    working prototype for the modeled system.", 
  location     = "https://doi.org/10.1109/32.7619"
}

@Article{oip,
  author       = "Larchev{\^ e}que, J.-M.",
  title        = "Optimal Incremental Parsing",
  journal      = toplas,
  year         = 1995,
  volume       = 17,
  number       = 1,
  pages        = "1--15",
  month        = jan,
  keywords     = "incremental parsing, threaded trees, semantic portability,
    node reuse, context reuse",
  abstract     = "This communication sets the problem of incremental parsing in
    the context of a complete incremental compiling system.  It turns out that,
    according to the incrementally paradigm of the attribute evaluator and
    data-flow analyzer to be used, two definitions of optimal incrementality in
    a parser are possible.  Algorithms for achieving both forms of optimality
    are given, both of them based on ordinary LALR(1) parse tables.  Optimality
    and correctness proofs, which are merely outlined in this communication,
    are made intuitive thanks to the concept of a well-formed list of threaded
    trees, a natural extension of the concept of threaded tree found in earlier
    works on incremental parsing.", 
  location     = "https://doi.org/10.1145/200994.200996"
}

@Article{aaeaffpv,
  author       = "Yoshiaki Kakuda and Yasushi Wakahara and Masamitsu Norigoe",
  title        = "An Acyclic Expansion Algorithm for Fast Protocol Validation",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 8,
  pages        = "1059--1069",
  month        = aug,
  keywords     = "communicating finite state machine, communications software,
    deadlock fifo channel, overflow, protocol error, protocol specification,
    protocol validation, reachability, software modules"
}

@Article{eaffmmig,
  author       = "Galil, Zvi",
  title        = "Efficient Algorithms for Finding Maximum Matching in Graphs",
  journal      = surveys,
  year         = 1986,
  volume       = 18,
  number       = 1,
  pages        = "23--38",
  month        = mar,
  keywords     = "algorithmic tools, assignment problem, augmenting path,
    blossoms, data structures, d-heap, duality, generalized priority queue,
    main theorem of botany, matching monsters, moonlighting, polygamy,
    primal-dual method, shmathematics, shrink, warm-up",
  abstract     = "This paper surveys the techniques used for designing the most
    efficient algorithms for finding a maximum cardinality or weighted matching
    in (general or bipartite) graphs.  It also lists some open problems
    concerning possible improvements in existing algorithms and the existence
    of fast parallel algorithms for these problems.", 
  location     = "https://doi.org/10.1145/6462.6502"
}

@Article{pasii,
  author       = "Dinesh  Katiyar and  David  Luckham and John  Mitchell",
  title        = "Polymorphism and Subtyping in Interfaces",
  journal      = sigplan # " (" # pot # "Workshop on Interface Definition Languages, IDL '94)",
  year         = 1994,
  volume       = 29,
  number       = 8,
  pages        = "22--34",
  month        = aug,
  keywords     = "types, interfaces, scope control, parameterized interfaces,
    subtyping, interface derivation, private interfaces, ", 
  abstract     = "RAPIDE is a programming language framework designed for the
    development of large, concurrent, real-time systems by prototyping.  The
    framework consists of a type language and default executable,
    specification and architecture languages, along with associated
    programming tools.  Interfaces are the central construct of the type
    system.  This document describes RAPIDE interfaces, their expressiveness
    and their use as a typing construct.",
  location     = "ftp://cs.stanford.edu/cs/theory/katiyar/papers/idl-workshop-94.ps"
}

@Article{fmosrop,
  author       = "Mili, Ali and Desharnais, Jules and Gagn{\' e}, Jean Raynomd",
  title        = "Formal Models of Stepwise Refinement of Programs",
  journal      = surveys,
  year         = 1986,
  volume       = 18,
  number       = 3,
  pages        = "231--276",
  month        = sep,
  keywords     = "alternation rule, assertion-based specifications, assignment
    rule, function-based specifications, generalization rule, iteration rule,
    relation-based specifications, sequence rule, program design rules,
    stepwise refinement, discrete mathematics",
  abstract     = "Of the many ways to express program specifications, three of
    the most common are: as a pair of assertions, an input assertion and an
    output assertion; as a function mapping legal inputs to correct outputs; or
    as a relation containing the input/output pairs that are considered
    correct.  The construction of programs consists of mapping a potentially
    complex specification into a program by recursively decomposing complex
    specifications into simpler ones.  We show how this decomposition takes
    place in all three modes of specification and draw some conclusions on the
    nature of programming.", 
  location     = "https://doi.org/10.1145/27632.28054"
}

@Article{apssiobdraqa,
  author       = "Alfons Kemper and Donald Kossmann",
  title        = "Adaptable Pointer Swizzling Strategies in Object Bases: Design, Realization, and Quantitative Analysis",
  journal      = "The VLDB Journal",
  year         = 1995,
  volume       = 4,
  number       = 3,
  pages        = "519--566",
  month        = jul,
  keywords     = "pointer swizzling, object-oriented database systems,
    performance evaluation, adaptive strategies, storage management, object,
    management",
  abstract     = {In this article, different techniques for "pointer swizzling"
    are classified and evaluated for optimizing the access to main-memory
    resident persistent objects.  To speed up the access along inter-object
    references, the persistent pointers in the form of unique object
    identifiers (OIDs) are transformed (swizzled) into main-memory pointers
    (addresses).  Pointer swizzling techniques can be divided into two classes:
    (1) those that allow replacement of swizzled objects from the buffer before
    the end of an application program, and (2) those that rule out the
    displacement of swizzled objects.  The first class (i.e., techniques that
    take "precautions" for the replacement of swizzled objects) has not yet
    been thoroughly investigated.  Four different pointer swizzling techniques
    allowing object replacement are investigated and compared with the
    performance of an object manager employing no pointer swizzling.  The
    extensive qualitative and quantitative evaluation—only part of which could
    be presented in this article—demonstrate that there is no one superior
    pointer swizzling strategy for all application profiles.  Therefore, an
    adaptable object base run-time system is devised that employs the full
    range of pointer swizzling strategies, depending on the application profile
    characteristics that are determined by, for example, monitoring in
    combination with sampling, user specifications, and/or program analysis.}, 
  location     = "http://www.db.fmi.uni-passau.de:8000/publications/journals/VLDBJ95.ps.Z", 
  location     = "DOI: 10.1007/BF01231646"
}

@Article{ttgpe,
  author       = "Mark Edel",
  title        = "The {T}inkertoy Graphical Programming Environment",
  journal      = tse,
  year         = 1988,
  volume       = 14,
  number       = 8,
  pages        = "1110--1115",
  month        = aug,
  keywords     = "graphical programming, graphics, iconic programming,
    interactive graphics, lisp, program visualization, syntax directed editing,
    user interfaces",
  abstract     = "The Tinkertoy graphical interface to Lisp is described, in
    which programs are 'built' rather than written, out of icons and flexible
    interconnections.  It represents a computer/user interface that can easily
    exceed the interaction speed of the best text-based language editors and
    command languages.  It also provides a consistent framework for interaction
    across both editing and command execution.  Moreover, because programs are
    represented graphically, structures that do not naturally conform to the
    text medium can be clearly described, the new kinds of information can be
    incorporated into programs and program elements.",
  location     = "https://doi.org/10.1109/32.7621"
}

@Book{taeff,
  author       = "Frederick Franck",
  title        = "The Awakened Eye",
  publisher    = "Knopf",
  year         = 1979,
  address      = nyny,
  keywords     = "drawing, zen, looking and seeing",
  location     = "NC 139.F72 A4"
}

@Book{tlwmg,
  author       = "Martha Grimes",
  title        = "The Lamorna Wink",
  publisher    = "Viking",
  year         = 1999,
  address      = nyny,
  keywords     = "murrdaar, the long arms of the past",
  location     = "PS 3557.R48994 L36"
}

@Book{tgofsothoap,
  author       = "Walter Mosley",
  title        = "The Gift of Fire \slash{} On the Head of a Pin",
  publisher    = "Tor",
  year         = 2012,
  address      = nyny,
  keywords     = "godz, vr",
  location     = "PS 3563.O88456 G54"
}

@Book{fscssbbesg,
  author       = "Simon Goldhill",
  title        = "Freud's Couch, Scott's Buttocks, Bront{\" e}'s Grave",
  publisher    = ucp,
  year         = 2011,
  address      = chil,
  keywords     = "scott, wordsworth, bronte, shakespere, freud, pilgrimages,
    victorians, writer's houses",
  location     = "PR 110.G7 G65"
}

@Book{tyematen,
  author       = "Salman Rushdie",
  title        = "Two Years Eight Months and Twenty-Eight Nights",
  publisher    = "Random House",
  year         = 2015,
  address      = nyny,
  keywords     = "magic, genies, conflict, miscegenation",
  location     = "PR 6068.U757 T96"
}

@Book{tfas,
  author       = "Daniel Kahneman",
  title        = "Thinking, Fast and Slow",
  publisher    = fsg,
  year         = 2011,
  address      = nyny,
  keywords     = "cognition, judgment, reasoning, decision making, risk
    analysis", 
  location     = "BF 441 K238"
}

@Book{spetdg,
  author       = "Philip~E. Tetlock and Dan Gardner",
  title        = "Superforecasters",
  publisher    = "Crown",
  year         = 2015,
  address      = nyny,
  keywords     = "forecasting, estimation, predictions, reasoning",
  location     = "HB 3730 T47"
}

@Book{trmwm,
  author       = "Walter Mosley",
  title        = "The Right Mistake",
  publisher    = "Basic Books",
  year         = 2008,
  address      = nyny,
  keywords     = "bootstrappin'",
  location     = "PS 3563.O88456 R48"
}

@Book{ttpl,
  author       = "Richard~C. Holt and Philip~A. Matthews and J.~Alan Rosselet and James~R. Cordy",
  title        = "The Turing Programming Language",
  publisher    = ph,
  year         = 1988,
  address      = ecnj,
  keywords     = "turing, programming language"
}

@Book{htbp,
  author       = "Eugenia Cheng",
  title        = "How to Bake $\pi$",
  publisher    = "Basic Books",
  year         = 2015,
  address      = nyny,
  keywords     = "mathematics, category theory",
  location     = "QA 9 C4862"
}

@Book{hnk,
  author       = "Noel Kingsbury",
  title        = "Hybrid",
  publisher    = ucp,
  year         = 2009,
  address      = chil,
  keywords     = "plant breeding, agriculture, hybridization",
  location     = "SB 123.K554"
}

@Book{bcof,
  author       = "James~M. McPherson",
  title        = "Battle Cry of Freedom",
  publisher    = oup,
  year         = 1988,
  volume       = "6",
  series       = "Oxford History of the United States",
  address      = nyny,
  keywords     = "civil war, slavery, politics, military",
  location     = "E 173.O94 v.6"
}

@Book{rgwm,
  author       = "Walter Mosley",
  title        = "Rose Gold",
  publisher    = "Doubleday",
  year         = 2014,
  address      = nyny,
  keywords     = "murrdaar, official corruption",
  location     = "PS 3463.O88456 R68"
}

@Book{idon,
  author       = "John~F. Geer",
  title        = "In Defense of Negativity",
  publisher    = ucp,
  year         = 2006,
  address      = chil,
  keywords     = "campaign management, political advertising, political
    campaigns, presidential elections, negativism, mud flinging, attack ads",
  location     = "JK 2281.G44"
}

@Book{erdr,
  author       = "Dani Rodrik",
  title        = "Economic Rules",
  publisher    = "W.~W. Norton",
  year         = 2015,
  address      = nyny,
  keywords     = "economics, modeling",
  location     = "HB 75 R5785"
}

@Book{sep,
  author       = "Walter Mosley",
  title        = "Six Easy Pieces",
  publisher    = "Atria Books",
  year         = 2003,
  address      = nyny,
  keywords     = "murrdaars",
  location     = "PS 3563.O88456 S59 2003"
}

@Book{iacp,
  author       = "Craig Packer",
  title        = "Into Africa",
  publisher    = ucp,
  year         = 1996,
  address      = chil,
  keywords     = "africa, serengetti, mammal research, lions, ecology",
  location     = "QL 31.P15 A3"
}

@Book{mjatgm,
  author       = "Lee Alan Dugatkin",
  title        = "Mr. Jefferson and the Giant Moose",
  publisher    = ucp,
  year         = 2009,
  address      = chil,
  keywords     = "natural history, degeneracy theory, buffon, jefferson, pr,
    scientific progress",
  location     = "QH 528 D843"
}

@Book{tgfwpw,
  author       = "Walter Prescott Webb",
  title        = "The Great Frontier",
  publisher    = uta # " Press",
  year         = 1964,
  address      = atx,
  keywords     = "civilization, development, institutions",
  location     = "CB 245 W4"
}

@Book{tttwm,
  author       = "Walter Mosley",
  title        = "The Tempest Tales",
  publisher    = "Black Classic Press",
  year         = 2008,
  address      = bama,
  keywords     = "morality, sin, heaven and hell",
  location     = "PS 3563.O88456 T46"
}

@Book{diabd,
  author       = "Walter Mosley",
  title        = "Devil in a Blue Dress",
  publisher    = "Washington Square Press",
  year         = 1990,
  address      = nyny,
  keywords     = "murrdaar, things ain't what the seem to be",
  location     = "PS 3563.O88456 D48"
}

@Book{otgoe,
  author       = "Peter Bacon Hales",
  title        = "Outside the Gates of Eden",
  publisher    = ucp,
  year         = 2014,
  address      = chil,
  keywords     = "the moderne, pop cult, atomic weaponry, levittown, dylan,
    hendrix, early computer games", 
  location     = "E 169.12 H339"
}

@Book{ldfma,
  author       = "Mike Adams",
  title        = "Lee de Forest",
  publisher    = "Springer",
  year         = 2012,
  address      = nyny,
  keywords     = "audion, inventing, patents, radio, talkies",
  location     = "TK 5739 D4 A33"
}

@Book{term,
  author       = "Randall Munroe",
  title        = "Thing Explainer",
  publisher    = "Houghton Mifflin Harcourt",
  year         = 2015,
  address      = boma,
  keywords     = "how things work, explanations",
  location     = "978 0 544 66825 6"
}

@Book{psssl,
  author       = "Seth Lerer",
  title        = "Prospero's Son",
  publisher    = ucp,
  year         = 2013,
  address      = chil,
  keywords     = "biography, theater, bloodlines",
  location     = "PR 55.L47 A3"
}

@Book{ditcac,
  author       = "Agatha Christie",
  title        = "Death in the Clouds",
  publisher    = "Dodd, Mead",
  year         = 1935,
  keywords     = "broadening travel, murrdaar",
  location     = "PZ 3 C4637 PR 6005 H66"
}

@Book{isymanomo,
  author       = "Richard White",
  title        = {"It's Your Misfortune and None of My Own"},
  publisher    = "University of Oklahoma Press",
  year         = 1991,
  address      = "Norman, Oklahoma",
  keywords     = "the american west, government, economic development,
    territorial politics, indigenous populations", 
  location     = "F 591 W69"
}

@Book{dotn,
  author       = "Agatha Christie",
  title        = "Death on the Nile",
  publisher    = "Dodd, Mead",
  year         = 1970,
  address      = nyny,
  keywords     = "murrdaar, teamwork",
  location     = "PR 6005.H66 D4"
}

@Book{cnglsh,
  author       = "Liang-shih Hahn",
  title        = "Complex Numbers \& Geometry",
  publisher    = "The Mathematical Association of America",
  year         = 1994,
  address      = "Washington, D.C.",
  keywords     = "complex numbers, geometry, mobius transforms",
  location     = "QA 255.H34 1994"
}

@Book{sre,
  author       = "Richard Ellis",
  title        = "Swordfish",
  publisher    = ucp,
  year         = 2013,
  address      = chil,
  keywords     = "swordfish, ocean ecology, fishing economics",
  location     = "QL 638.X5 E45"
}

@Book{mmpdrg,
  author       = "Persi Diaconis and Ron Graham",
  title        = "Magical Mathematics",
  subtitle     = "The Mathematical Ideas that Animate Great Magic Tricks",
  publisher    = pup,
  year         = 2012,
  address      = prnj,
  keywords     = "cycles, mandelbrot set, shuffles",
  location     = "GV 1549 D53"
}

@Book{ittgocn,
  author       = "Roland Deaux",
  title        = "Introduction to the Geometry of Complex Numbers",
  publisher    = "Dover",
  year         = 2008,
  address      = "Mineola, New York",
  keywords     = "complex numbers, geometric representation, analytic geometry,
    circular transformations, conics, homography",
  location     = "QA 471 D373"
}

@Book{gacn,
  author       = "Hans Schwerdtfeger",
  title        = "Geometry and Complex Numbers",
  publisher    = "Dover",
  year         = 1979,
  address      = nyny,
  keywords     = "analytic geometry, circles, moebius transformation,
    non-euclidean geometries",
  location     = "QA 255 S36"
}

@Book{tloh,
  author       = "Agatha Christie",
  title        = "The Labours of Hercules",
  publisher    = "Dodd, Mead",
  year         = 1967,
  address      = nyny,
  keywords     = "murrdaar, the classics",
  location     = "PR 6005.H66 L33"
}

@Book{hpsc,
  author       = "Agatha Christie",
  title        = "Hercule Poirot's Christmas",
  publisher    = "William Morrow",
  year         = 2011,
  address      = nyny,
  keywords     = "murrdaar, family life",
  location     = "PR 6005.H66 H44"
}

@Book{asbrl,
  author       = "Roger Lowenstein",
  title        = "America's Bank",
  publisher    = "Penguin",
  year         = 2015,
  address      = nyny,
  keywords     = "federal reserve, monetary policy, politics, populism, wall
    street, finance, central banking, federalism",
  location     = "HG 2563 L69"
}

@Book{amia,
  author       = "Agatha Christie",
  title        = "{A} Murder is Announced",
  publisher    = "Dodd, Mead",
  year         = 1950,
  address      = nyny,
  keywords     = "murrdaar, identity",
  location     = "PR 6005 H66 M847"
}

@Book{hpsec,
  author       = "Agatha Christie",
  title        = "Hercule Poirot's Early Cases",
  publisher    = "Dodd, Mead",
  year         = 1974,
  address      = nyny,
  keywords     = "murrdaar",
  location     = "PZ3.C4637 Hh3 PR6005.H66"
}

@Book{tvhk,
  author       = "Han Kang",
  title        = "The Vegetarian",
  publisher    = "Hogarth",
  year         = 2015,
  address      = loen,
  keywords     = "differences of opinion, the integrity of art, what is
    madness",
  location     = "PL 992.26 K36 C4313"
}

@Book{motoe,
  author       = "Agatha Christie",
  title        = "Murder on the Orient Express",
  publisher    = "William Morrow",
  year         = 2011,
  address      = nyny,
  keywords     = "murrdaar, teamwork",
  location     = "PR 6005.H66 M88"
}

@Book{trafoag,
  author       = "Robert~J. Gordon",
  title        = "The Rise and Fall of American Growth",
  publisher    = pup,
  year         = 2016,
  address      = prnj,
  keywords     = "economics, growth, development, economic policy",
  location     = "HD 6983 G69"
}

@Book{cac1975,
  author       = "Agatha Christie",
  title        = "Curtain",
  publisher    = "Dodd, Mead",
  year         = 1975,
  address      = nyny,
  keywords     = "murrdaar, the evils that men do",
  location     = "PZ3.C4637 PR6005.H66"
}

@Book{acos,
  author       = "Olja Savi{\v c}evi{\' c}",
  title        = "Adios Cowboy",
  publisher    = "McSweeny's",
  year         = 2016,
  address      = sfca,
  keywords     = "going home, remembering, figuring it out",
  location     = "PG 1620.29.A95A2"
}

@Book{tmfac,
  author       = "Agatha Christie",
  title        = "The Moving Finger",
  publisher    = "Dodd, Mead",
  year         = 1942,
  address      = nyny,
  keywords     = "murrdaar, mighty pens",
  location     = "PR 6005.H66 M64"
}

@Book{tawbk,
  author       = "Blair Kamin",
  title        = "Terror and Wonder",
  publisher    = ucp,
  year         = 2010,
  address      = chil,
  keywords     = "architecture, security, design, ecology",
  location     = "NA 712.7.K36"
}

@Book{nomac,
  author       = "Agatha Christie",
  title        = "{N} or {M}?",
  publisher    = "Dodd, Mead",
  year         = 1941,
  address      = nyny,
  keywords     = "murrdaar, dastardly spies",
  location     = ""
}

@Book{twols,
  author       = "David Jaher",
  title        = "The Witch of Lime Street",
  publisher    = "Crown",
  year         = 2015,
  address      = nyny,
  keywords     = "spiritualism, houdini, doyle, fraud, scientific
    inquiry", 
  location     = "BF 1283 C85 J34"
}

@Book{ircs,
  author       = "Carl Shapiro and Hal~R. Varian",
  title        = "Information Rules",
  publisher    = "Harvard Business School Press",
  year         = 1999,
  address      = boma,
  keywords     = "business strategies, the internet, the information economy",
  location     = "HC 79.I55 S53"
}

@Book{tphac,
  author       = "Agatha Christie",
  title        = "The Pale Horse",
  publisher    = "Harper",
  year         = 1961,
  address      = nyny,
  keywords     = "auras and emanations, murrdaar",
  location     = "PZ 3.C4637 PR6005.H66"
}

@Book{tmatv,
  author       = "Paul Murray",
  title        = "The Mark and the Void",
  publisher    = "Farrar, Straus and Giroux",
  year         = 2015,
  address      = nyny,
  keywords     = "banking, fraud",
  location     = "PR 6113.U78 M37."
}

@Book{ssac,
  author       = "Agatha Christie",
  title        = "Surprise! Surprise!",
  publisher    = "Dodd, Mead",
  year         = 1965,
  address      = nyny,
  keywords     = "murrdaar",
  location     = "PZ 7.C4529"
}

@Book{pohrbw,
  author       = "Randall~B. Woods",
  title        = "Prisoners of Hope",
  publisher    = "Basic Books",
  year         = 2016,
  address      = nyny,
  keywords     = "lbj, great society, racism, the 60s, vietnam, politics",
  location     = "E 846.W66"
}

@Book{smac,
  author       = "Agatha Christie",
  title        = "Sleeping Murder",
  publisher    = "Harper",
  year         = 1976,
  address      = nyny,
  keywords     = "murrdaar, deep roots",
  location     = "PZ 3.C4637 Sm"
}

@Book{ajkm,
  author       = "Karim Misk{\' e}",
  title        = "Arab Jazz",
  publisher    = "MacLehose Press",
  year         = 2012,
  address      = nyny,
  keywords     = "murrdaar, religion, drugs",
  location     = "PQ 2673.I78 A7313"
}

@Book{erdo,
  author       = "Daniel Oppenheimer",
  title        = "Exit Right",
  publisher    = "Simon \& Schuster",
  year         = 2016,
  address      = nyny,
  keywords     = "chambers, burnham, regan, podhoretz, horowitz, hitchens",
  location     = "E 747.O67"
}

@Book{tgac,
  author       = "Agatha Christie",
  title        = "Third Girl",
  publisher    = "Dodd, Mead",
  year         = 1966,
  address      = nyny,
  keywords     = "murrdaar, gaslighting",
  location     = "PR 6005.H66"
}

@Book{tlsta,
  author       = "Ted Anton",
  title        = "The Longevity Seekers",
  publisher    = ucp,
  year         = 2013,
  address      = chil,
  keywords     = "longevity, aging, science, venture capitalism, genetics,
    social policy",
  location     = "HB 1322.3.A58"
}

@Book{ndhlm,
  author       = "H.~L. Mencken",
  title        = "Newspaper Days",
  publisher    = "Knopf",
  year         = 1941,
  address      = nyny,
  keywords     = "journalism, reporters",
  location     = "PS 3525.E43 Z53"
}

@Book{hdhlm,
  author       = "H.~L. Mencken",
  title        = "Heathen Days",
  publisher    = "Knopf",
  year         = 1943,
  address      = nyny,
  keywords     = "travel, personages",
  location     = "PS 3525.E43 Z533"
}

@Book{tbrlc,
  author       = "Libby Cudmore",
  title        = "The Big Rewind",
  publisher    = "William Morrow",
  year         = 2016,
  address      = nyny,
  keywords     = "murrdaar, hipsters",
  location     = ""
}

@Book{trlb,
  author       = "Laudomina Bonanni",
  title        = "The Reprisal",
  publisher    = ucp,
  year         = 2013,
  address      = chil,
  keywords     = "ww ii, revenge",
  location     = "PQ 4807.O555 R3713"
}

@Book{tbmw,
  author       = "Mary Westmacott",
  title        = "The Burden",
  publisher    = "Arbor House",
  year         = 1956,
  address      = nyny,
  keywords     = "sisterhood, guilt",
  aka          = "Agatha Christie",
  location     = "PZ 3.C4637 Bu"		  
}

@Book{tlsrjdm,
  author       = "John~D. MacDonald",
  title        = "The Lonely Silver Rain",
  publisher    = "Knopf",
  year         = 1985,
  address      = nyny,
  keywords     = "murrdaar, impetuous youth",
  location     = "PS 3563.A28 L6"
}

@Book{tditwc,
  author       = "Eric Larson",
  title        = "The Devil in the White City",
  publisher    = "Vantage",
  year         = 2013,
  address      = nyny,
  keywords     = "world expositions, murrdaar, psychopaths, ferris wheels",
  location     = "HV 6248.M8 L37 2003"
}

@Book{spqrmb,
  author       = "Mary Beard",
  title        = "{SPQR}",
  publisher    = "Liveright",
  year         = 2015,
  address      = nyny,
  keywords     = "ancient rome",
  location     = "DG 231.B43 2015"
}

@Book{ttyf,
  author       = "David Welky",
  title        = "The Thousand-Year Flood",
  publisher    = ucp,
  year         = 2011,
  address      = chil,
  keywords     = "flood control, disaster response, ohio river valley, the new
    deal, federal-local governance",
  location     = "HV 6101937.M57 W45"
}

@Book{tfye,
  author       = "John~D. MacDonald",
  title        = "The Fearful Yellow Eye",
  publisher    = "J.~B. Lippincott",
  year         = 1966,
  address      = phpa,
  keywords     = "extortion, murrdaar",
  location     = "PS 3563.A28 "
}

@Book{tcor,
  author       = "Stephen Holmes and Cass~R. Sunstein",
  title        = "The Cost of Rights",
  publisher    = "W.~W. Norton",
  year         = 1999,
  address      = nyny,
  keywords     = "rights, responsibilities, governance, taxes, redistribution,
    property rights, laws, enforcement, welfare",
  location     = "JC 599.U5 H55"
}

@Book{bddp,
  author       = "Darryl Pinckney",
  title        = "Black Deutschland",
  publisher    = "Farrar, Straus and Giroux",
  year         = 2016,
  address      = nyny,
  keywords     = "expats, berlin",
  location     = "PS 3566.I516 B58"
}

@Book{tipbs,
  author       = "Bernd Stiegler",
  title        = "Traveling in Place",
  publisher    = ucp,
  year         = 2013,
  address      = chil,
  keywords     = "travel, rooms",
  location     = "PN 56.T7 S8513"
}

@Book{sgsj,
  author       = "Susan Jacoby",
  title        = "Strange Gods",
  publisher    = "Pantheon",
  year         = 2016,
  address      = nyny,
  keywords     = "religion, conversions",
  location     = "BL 639.J33"
}

@Book{nipjdm,
  author       = "John~D. MacDonald",
  title        = "Nightmare in Pink",
  publisher    = "J.~B. Lippencott",
  year         = 1976,
  address      = phpa,
  keywords     = "have a nice trip, grift",
  location     = "PS 3563.A28"
}

@Book{podllng,
  author       = "Leo Lowenthal and Norbert Guterman",
  title        = "Prophets of Deceit",
  publisher    = "Harper \& Brothers",
  year         = 1949,
  address      = nyny,
  keywords     = "antisemitism, anticommunism, propaganda, psychology,
    agitators", 
  location     = "HM 263 L6"
}

@Book{bjbb,
  author       = "Joshua {Blu Buhs}",
  title        = "Bigfoot",
  publisher    = ucp,
  year         = 2009,
  address      = chil,
  keywords     = "yeti, abominable snowman, susquatch, bigfoot, cryptozoology,
    anthropology, mass media",
  location     = "QL 89.2.S2 B84"
}

@Book{hdm,
  author       = "Daivd Means",
  title        = "Hystopia",
  publisher    = "Farrar, Straus, and Giroux",
  year         = 2016,
  address      = nyny,
  keywords     = "alternative histories, viet nam, domestic strife",
  location     = "PS 3563.E195 H97"
}

@Book{ljeb,
  author       = "Ethan Brown",
  title        = "Learning JavaScript",
  publisher    = "O'Reilly",
  year         = 2016,
  address      = seca,
  edition      = "Third",
  keywords     = "javascript, ecmascript 6,",
  location     = "QA 76.73.J39 P7"
}

@Book{motgs,
  author       = "John~D. MacDonald",
  title        = "More of the Good Stuff",
  publisher    = "Knopf",
  year         = 1984,
  address      = nyny,
  keywords     = "murrdaar, skullduggery",
  location     = "PS 3563 A28 M6"
}

@Book{wtrww,
  author       = "E.~J. {Dionne, Jr.}",
  title        = "Why the Right Went Wrong",
  publisher    = "Simon \& Schuster",
  year         = 2016,
  address      = nyny,
  keywords     = "politics, political parties, conservatism, u.s. politics",
  location     = "JC 573.3.U6 D57"
}

@Book{asio,
  author       = "Sofia Samatar",
  title        = "{A} Stranger in Olondria",
  publisher    = "Small Beer Press",
  year         = 2013,
  address      = "Easthampton, MA",
  keywords     = "angels, closure",
  location     = "PS 3619.A4496 S77"
}

@Book{wtni,
  author       = "Nancy Isenberg",
  title        = "White Trash",
  publisher    = "Viking",
  year         = 2016,
  address      = nyny,
  keywords     = "class, american history",
  location     = "HN 90.S6 I84"
}

@Book{cbd2016,
  author       = "Brian Doyle",
  title        = "Chicago",
  publisher    = "St.~Martin's Press",
  year         = 2016,
  address      = nyny,
  keywords     = "chicago",
  location     = "PS 3604.O9547 C49"
}

@Book{cmm2008,
  author       = "Mark Monmonier",
  title        = "Coastlines",
  publisher    = ucp,
  year         = 2008,
  address      = chil,
  keywords     = "map making, cartography, sea coasts",
  location     = "GA 108.7.M65"
}

@Book{asrs,
  author       = "Matthew McBride",
  title        = "{A} Swollen Red Sun",
  publisher    = "MysteriousPress.com\slash Open Road Integrated Media, Inc.",
  year         = 2014,
  address      = nyny,
  keywords     = "murrdaar, drugs",
  location     = "978 1 4804 8571 6"
}

@Book{esbre,
  author       = "Roger Ebert",
  title        = "Ebert's Best",
  publisher    = "Chicago Shorts",
  year         = 2013,
  address      = chil,
  keywords     = "movies",
  location     = "978 0 226 04890 1"
}

@Book{nifde,
  author       = "Todd~G. Buchholz",
  title        = "New Ideas From Dead Economists",
  publisher    = "New American Library",
  year         = 1989,
  address      = nyny,
  keywords     = "economists, economic theory",
  location     = "HB 76 B83"
}

@Book{lltf,
  author       = "Thomas Frank",
  title        = "Listen, Liberal",
  publisher    = "Metropolitan Books",
  year         = 2016,
  address      = nyny,
  keywords     = "democratic party, politics, class politics, meritocracy,
    credentialism, liberalism", 
  location     = "JK 2316.F73 2016"
}

@Book{hoe,
  author       = "Paul R. Ehrlich and Michael Charles Tobias",
  title        = "Hope On Earth",
  publisher    = ucp,
  year         = 2014,
  address      = chil,
  keywords     = "ecology, environmental ethics, global environmental change,
    nature conservation, population",
  location     = "QH 541.I45.H665"
}

@Book{mles,
  author       = "Emma Straub",
  title        = "Modern Lovers",
  publisher    = "Riverhead Books",
  year         = 2016,
  address      = nyny,
  keywords     = "love, life",
  location     = "PS 3619.T74259 M63"
}

@Book{bftb,
  author       = "Conrad Barski and Chris Wilmer",
  title        = "Bitcoin for the Befuddled",
  publisher    = "No Starch Press",
  year         = 2015,
  address      = sfca,
  keywords     = "bitcoin, cryptography, peer-to-peer networks, currency",
  location     = "https://lccn.loc.gov/2014951031"
}

@Book{nbb,
  author       = "Craig~A. Monson",
  title        = "Nuns Behaving Badly",
  publisher    = ucp,
  year         = 2010,
  address      = chil,
  keywords     = "church governance, nuns, convents, canon law, italy",
  location     = "BX 4220.I8 M68"
}

@Book{ptd,
  author       = "Helen Morales",
  title        = "Pilgrimage to Dollywood",
  publisher    = ucp,
  year         = 2014,
  address      = chil,
  keywords     = "country music, theme parks, dolly parton",
  location     = "ML 420.P28 M67"
}

@Book{gtrfsb,
  author       = "Roger Fisher and Scott Brown",
  title        = "Getting Together",
  publisher    = "Penguin",
  year         = 1988,
  address      = nyny,
  keywords     = "negotiation, trust, interpersonal relationships",
  location     = "BF 637.N4 F58"
}

@Book{ajdg,
  author       = "John {de Graaf} and David Wann and Thomas~H. Naylor",
  title        = "Affluenza",
  publisher    = "Berrett-Koehier",
  year         = 2014,
  address      = sfca,
  keywords     = "affluence",
  location     = "HN 60.D396"
}

@Book{rufic,
  author       = "Ann Durkin Keating",
  title        = "Rising Up From Indian Country",
  publisher    = ucp,
  year         = 2012,
  address      = chil,
  keywords     = "chicago, fort dearborn massacre, john Kinzie",
  location     = "E 356.C53 K43"
}

@Book{tacp,
  author       = "Camille Perri",
  title        = "The Assistants",
  publisher    = "G.~P. Putnam's Sons",
  year         = 2016,
  address      = nyny,
  keywords     = "inequality, student loans, robin hood",
  location     = "PS 3616.E768 A88"
}

@InProceedings{wsm,
  author       = "Ryan Culpepper and Mathias Felleisen",
  title        = "Well-Shaped Macros",
  booktitle    = "Scheme 2003: " # pot # " Fourth Workshop on Scheme and Functional Programming",
  year         = 2003,
  editor       = "Matthew Flatt",
  pages        = "59--68",
  address      = boma,
  month        = "7 " # nov,
  keywords     = "macros, shapes, scheme",
  abstract     = "Scheme includes an easy-to-use and powerful macro mechanism
    for extending the programming language with new expression and definition
    forms.  Using macros, a Scheme programmer can define a new notation for a
    specific problem domain and can then state algorithms in this language.
    Thus, Scheme programmers can formulate layers of abstraction whose
    expressive power greatly surpasses that of ordinary modules.
    Unfortunately, Scheme's macros are also too powerful.  The problem is that
    macro definitions extend the parser, a component of a language's
    environment that is always supposed to terminate and produce predictable
    results, and that they can thus turn the parser into a chaotic and
    unpredictable tool.  In this paper, we report on an experiment to tame the
    power of macros.  Specifically, we introduce a system for specifying and
    restricting the class of shapes that a macro can transform.  We dub the
    revised macro system well-shaped macros.", 
  location     = "www.cs.utah.edu/techreports/2003/abstracts/UUCS-03-023a.pdf"
}

@InProceedings{satstaotnoem,
  author       = "Teh, Phoey Lee and Rayson, Paul and Pak, Irina and Piao, Scott",
  title        = "Sentiment Analysis Tools Should Take Account of the Number of Exclamatio Marks!!!",
  booktitle    = pot # "17th International Conference on Information Integration and Web-based Applications \& Services (iiWAS '15)",
  year         = 2015,
  address      = "Brussels, Belgium",
  month        = "11--13 " # dec,
  keywords     = "sentiment tools, exclamation marks, comments, emotions,
    reviews, human factors, text analysis",
  abstract     = "There are various factors that affect the sentiment level
    expressed in textual comments.  Capitalization of letters tends to mark
    something for attention and repeating of letters tends to strengthen the
    emotion.  Emoticons are used to help visualize facial expressions which can
    affect understanding of text.  In this paper, we show the effect of the
    number of exclamation marks used, via testing with twelve online sentiment
    tools.  We present opinions gathered from 500 respondents towards like and
    dislike values, with a varying number of exclamation marks.  Results show
    that only 20% of the online sentiment tools tested considered the number of
    exclamation marks in their returned scores.  However, results from our
    human raters show that the more exclamation marks used for positive
    comments, the more they have higher like values than the same comments with
    fewer exclamations marks.  Similarly, adding more exclamation marks for
    negative comments, results in a higher dislike.", 
  location     = "http://dx.doi.org/10.1145/2837185.2837216"
}

@InProceedings{fmflwiams,
  author       = "H. Naciri and L. Rideau",
  title        = "Figue:  Mathematical FOrmula Layout with Interaction and {MathML} Support",
  booktitle    = pot # "Fifth Asian Symposium on Computer Mathematics (ASCM 2001)",
  year         = 2001,
  pages        = "112--121",
  publisher    = "World Scientific",
  address      = "Matsuyama, Japan",
  month        = "29--28 " # sep,
  keywords     = "mathml, layout, mathematics",
  abstract     = "Tools for mathematics often need to display formulas, to 
    interact with them, and also make them easily accessible on the Internet.
    In this paper, we present FIGUE, an interactive two dimensional layout
    engine specialised for building WYSIWYG environments for symbolic systems
    and scientific document editors.  This component is currently used for
    developing a mathematical proofs interface.  In order to communicate
    mathematical data on the Internet, FIGUE also supports MathML standard: it
    generates, processes, and renders MathML documents.", 
  location     = "http://dx.doi.org/10.1142/9789812799661_0012"
}

@InProceedings{r20a,
  author       = "Stephen~T. Bachinsky and Glenn~H. Tarbox and Larry Mellon and Richard Fujimoto",
  title        = "{RTI} 2.0 Architecture",
  booktitle    = pot # "1998 Spring Simulation Interoperability Workshop (SIW ’98)",
  year         = 1998,
  editor       = "",
  pages        = "",
  address      = "Orlando, Florida",
  month        = "9--13 " # mar,
  keywords     = "high-level architecture, runtime infrastructure, time
    management, interest management",
  abstract     = "A recent DMSO (Defense Modeling and Simulation Office)
    initiative resulted in a new RTI design and build effort.  This paper
    describes the design constructs used in the RTI 2.0 architecture and the
    driving principles used throughout the design process.  Key architectural
    features are identified and analyzed in terms of meeting the RTI's set of
    requirements.  Concepts such as system scalability, runtime performance,
    federation-specific tuning, reliability, and maintainability are discussed
    within the confines of the RTI 2.0 architecture.  This paper presents
    information representing the HLA development process underway by the DMSO
    and the DoD AMG (Architecture Management Group).", 
  location     = "http://www.cs.bham.ac.uk/research/projects/pdesmas/LITERATURE/RTI2.0Arch.pdf"
}

@InProceedings{vafffpv,
  author       = "McCanne, Stephen. and Van Jacobson",
  title        = "{vic}: A Flexible Framework for Packet Video",
  booktitle    = pot # "Third ACM International Conference on Multimedia",
  year         = 1995,
  pages        = "511--522",
  address      = sfca,
  month        = nov,
  keywords     = "conferencing protocols, digital video, image and video
    compression and processing, multicasting, networking and communication", 
  abstract     = "The deployment of IP Multicast has fostered the development 
    of a suite of applications, collectively known as the MBone tools, for
    real-time multimedia conferencing over the Internet.  Two of these tools --
    nv from Xerox PARC and ivs from INRIA -- provide video transmission using
    software-based codecs.  We describe a new video tool, vic, that extends the
    groundbreaking work of nv and ivs with a moreflexible system architecture.
    This flexibility is characterized by network layer independence, support
    for hardware-based codecs, a conference coordination model, an extensible
    user interface, and support for diverse compression algorithms.  We also
    propose a novel compression scheme called Intra-H.261.  Created as a hybrid
    of the nv and ivs codecs, Intra-H.261 provides a factor of 2-3 improvement
    in compression gain over the nv encoder (6 dB of PSNR) as well as a
    substantial run-time performance improvement over the ivs H.261 coder.", 
  location     = "ftp://ftp.ee.lbl.gov/papers/vic-mm95.ps.Z"
}

		  
@TechReport{taotiotmcpzoat,
  author       = "Steele Jr., Guy Lewis and Sussman, Gerald~J.",
  title        = "The Art of the Interpreter or, The Modularity Complex (Parts Zero, One, and Two)",
  institution  = ail # ", " # mit,
  year         = 1978,
  type         = "AI Memo",
  number       = 453,
  address      = cma,
  month        = may,
  keywords     = "abstraction, actors, applicative order, bindings, control
    structures, debugging, dynamic scoping, environments, fluid variables,
    funarg problem, functional objects, interactive programming, lambda
    calculus, lexical scoping, lisp, modularity, procedural data, recursion
    equations, referential transparency, scheme, side effects, static scoping,
    structured programming", 
  abstract     = "We examine the effects of various language design decisions
    on the programming styles available to a user of the language, with
    particular emphasis on the ability to incrementally construct modular
    systems.  At each step we exhibit an interactive meta-circular interpreter
    for the language under consideration.  Each new interpreter is the result
    of an incremental change to a previous interpreter.  The interpreters we
    exhibit are all written in a simple dialect of LISP, and all implement
    LISP-like languages.  A subset of these interpreters constitute a partial
    historical reconstruction of the actual evolution of LISP.", 
  location     = "http://repository.readscheme.org/ftp/papers/ai-lab-pubs/AIM-453.pdf"
}

@TechReport{spirl,
  author       = "Robert Lawler",
  title        = "Some Powerful Ideas",
  institution  = ail # ", " # mit,
  year         = 1981,
  type         = "A.I. Memo",
  number       = 652,
  address      = cma,
  month        = dec,
  keywords     = "logo, heuristics, problem solving",
  abstract     = "Here is a set of problem solving ideas (absorbed by and 
    developed through the MIT Logo project over many years) presented in such a
    way as to useful to someone with a Logo computer.  With the ideas on
    unbound, single sheets, you can easily pick out those you like and set
    aside the others.  The ideas vary in sophistication and accessibility: no
    threshold, no ceiling.", 
  location     = "http://hdl.handle.net/1721.1/6363"
}

@TechReport{ajtfo,
  author       = "Peter Nelson",
  title        = "{A} {JIT} Translator for {O}beron",
  institution  = "New College",
  year         = 2010,
  address      = oxuk,
  month        = "20 " # may,
  keywords     = "jit compilation, oberon",
  abstract     = "The aim was to implement a JIT runtime for the Oxford Oberon-2
    platform using the open source libjit library.  The Oxford Oberon-2
    platform consists of a compiler and runtime.  The runtime system uses a
    stack-based virtual machine, with an architecture similar to that of the
    JVM and CLR.  Even with only a few simple runtime code optimisations, the
    completed JIT performed far better than the interpreter implementation in a
    number of informal benchmarking tests, even coming close to the performance
    of Mono 2.6.  A possible future project could involve adding to and
    improving on the optimisation techniques, and more formal benchmarking
    tests.",
  location     = "http://peterdn.com/page/A-JIT-Translator-for-Oberon.aspx"
}

@TechReport{stfamc,
  author       = "Peter~S. Langston",
  title        = "Six Techniques for Algorithmic Music Composition",
  institution  = "Bellcore",
  year         = 1988,
  address      = "Morristown, N.J.",
  keywords     = "stochastic generation, fractals, midi",
  abstract     = "Can machines compose music? Is composition an artistic act of
    inspired creation beyond the scope of current technology or is it amenable
    to some form of computer contribution? This report describes algorithms
    that perform specific composition tasks.Developing methods of machine
    composition requires the solution of a number of difficult problems in the
    fields of algorithm design, data representation, and human interface
    design, using techniques from software engineering, generative grammars,
    computer graphics, and others.  At Bellcore a set of programs composes and
    plays music for listeners who have dialed in through the public switched
    telephone network.  This paper describes, in detail, six algorithms
    developed for those programs to deal with specific aspects of music
    composition.  Stochastic Binary Subdivision generates non-repeating
    rhythmic structures that avoid common rhythmic problems.  Riffology 
    generates acceptable improvised melodies with little computing overhead.
    Auditals is a grammar-based technique to exploit the similarities between
    plant structure and musical structure.  Key Phrase Animation and Fractal
    Interpolation are approaches borrowed from computer graphics and used for
    melodic embellishment.  Expert Novice Picker composes authentic banjo solos
    based on expert knowledge.  All of the algorithms strive for a certain
    elegance in style - compact source code expressing a single technique with
    few special cases and little arbitrariness other than the use of random
    numbers.  Algorithms such as these are useful tools on the computer
    composer's workbench.", 
  location     = "http://peterlangston.com/Papers/amc.pdf"
}

@TechReport{fraf,
  author       = "Bob Sproull",
  title        = "Font Representations and Formats",
  institution  = "Computer Science Laboratory " # parc,
  year         = 1980,
  address      = paca,
  month        = oct,
  keywords     = "fonts, alto, rasters, splines",
  abstract     = "This report presents the various standard and
    device-dependent font formats in use at PARC",
  location     = "ftp://bitsavers.informatik.uni-stuttgart.de/pdf/xerox/alto/printing/AltoFontFormats_Oct1980.pdf"
}

@TechReport{piipasftin,
  author       = "Ralph~E. Griswold",
  title        = "Programming in {I}con; Problems and Solutions from the {I}con {N}ewsletter",
  institution  = dcs # uaz,
  year         = 1986,
  number       = "TR 86-2",
  address      = taz,
  month        = 1 # " " # jan,
  keywords     = "icon, programming problems",
  abstract     = "The Icon Newsletter was started in 1978 as a vehicle for
    distributing information about the Icon programming language.  One
    continuing feature of the Newsletter is a programming corner that presents
    programming techniques, problems, and solutions.  This report is a
    compilation of that material.  It starts with Icon Newsletter #5, since
    earlier Newsletters contained material related to versions of Icon that are
    now obsolete.  Most of the material that follows appears as it was
    originally published, although there are some editorial changes to correct
    errors, to improve continuity, and to bring earlier program material up to
    the syntax of Version 5.",
  location     = "https://www.cs.arizona.edu/icon/ftp/doc/tr86_2b.pdf"
}

@TechReport{aphoa,
  author       = "Michael~S. Montalbano",
  title        = "A Personal History of {APL}",
  institution  = "General Products Division, Santa Teresa Laboratory, International Business Machines Corporation",
  year         = 1982,
  number       = "TR-03 214",
  address      = "San Jose, California",
  month        = oct,
  keywords     = "apl, notation, management",
  location     = "http://ed-thelen.org/comp-hist/APL-hist.html"
}

@TechReport{tgnvdcs,
  author       = "Daniel~I. Applebaum",
  title        = "The {\it {G}alatea} Network Video Device Control System",
  institution  = "M.I.T. Media Laboratory",
  year         = 1990,
  address      = cma,
  keywords     = "client-server model, protocols, interfaces, video management,
    configuration",
  location     = "http://mf.media.mit.edu/pubs/techreport/ProjGalatea.pdf"
}

@TechReport{aiofll,
  author       = "Warner Hans and Stephan Winkler",
  title        = "Abstract Interpretation of Functional Logic Languages",
  institution  = "RWTH Aachen",
  year         = 1993,
  number       = "1992--43",
  address      = "Aachen, Germany",
  month        = "12 " # jan,
  keywords     = "functional logic language, abstract interpretation,
    transformations, specialization, non-strict operations, safe analysis,
    operational semantics",
  abstract     = "The technique of abstract interpretation is used in 
    functional and logic programming with various applications.  In this paper,
    we show how methods of abstract interpretation for logic programming can be
    adapted for purposes of functional logic languages.  But these extensions
    are not straightforward --- especially the presence of non-strict
    operations and a three-valued boolean domain cause additional problems.  It
    is shown how the usage of slightly modified original techniques together
    with a program transformation that incorporates a result directed analysis
    can yield good results.", 
  location     = "http://ftp.informatik.rwth-aachen.de/Publications/AIB/1992/1992-43.ps.gz"
}

@TechReport{c0fsig45,
  author       = "Arpan Sen",
  title        = "{C}++0x feature support in {GCC} 4.5",
  institution  = "IBM",
  year         = 2011,
  type         = "DeveloperWorks",
  month        = "1 " # mar,
  keywords     = "c++, unicode, initialization lists, type inference, lambdas",
  location     = "https://www.ibm.com/developerworks/aix/library/au-gcc/"
}

@MastersThesis{nlpffolp,
  author       = "Kevin~T. Driver",
  title        = "Natural Language Processing for First Order Logic Problems",
  school       = uta # " at Austin",
  year         = 2007,
  address      = atx,
  month        = dec,
  keywords     = "alloy, knaves, knights, logic puzzles, satisfaction",
  abstract     = "Designing software and implementing these designs are 
    processes highly prone to error.  Despite the best human effort, these
    designs and implementations often produce software with undesired results
    or difficult-to-detect defects.  The Software Design Group at MIT has
    produced the Alloy modeling language in order to address these issues.
    Model-checking with Alloy allows for the specification of invariants and
    the itemization of possible satisfying program executions, as well as other
    features.  One downside in the use of Alloy is that the model designer is
    required to learn another language with all its syntax and semantics,
    simply to express the model.  A more ideal situation would be to bridge the
    gap between the model designer and the modeling software with some
    understanding and processing of natural language.  The focus of this paper
    is to present a solution of natural language processing coupled with model
    design for a certain problem domain.  Based upon prior work of the author
    and his colleagues, a grammar will be presented and examined, and the
    conversion from natural language to Alloy will be discussed.  Additional
    analyses of members of the problem domain will then be presented, including
    meaningful dissection of unsatisfiable models using new additions to the
    Alloy language and mapping these results back to the original natural
    language model.  In this way, describing models is made easier with the
    added advantage of detecting and isolating unsatisfiable portions of the
    model.  The implications of this effort reveal numerous applications in the
    software discipline and beyond." 
}

@Manual{pwscfic,
  title        = "Programming With System Calls For Interprocess Communication",
  organization = "Apollo Computer Inc.",
  address      = "330 Billerica Road, Chelmsford, MA 01824",
  revision     = "00",
  softwarerel  = "9.0",
  orderno      = "005696",
  year         = 1985,
  month        = jul,
  keywords     = "pascal, ipc, mailboxes, datagrams, file mapping",
  location     = "http://bitsavers.informatik.uni-stuttgart.de/pdf/apollo/005696-00_Programming_With_System_Calls_For_Interprocess_Communications_Jul85.pdf"
}

@Manual{casplfcl,
  title        = "Chio:  {A} String Processing Library for Common Lisp",
  author       = "Jonathan~E. Spingarn",
  year         = 2003,
  month        = sep,
  keywords     = "common lisp, string processing, libraries",
  location     = "http://www.toiling-in-obscurity.net/chio/"
}

@Manual{htwasos,
  title        = "How to Write a Simple Operating System",
  author       = "Mike Saunders",
  year         = 2009,
  keywords     = "operating systems, assembly, linux, boot-loaders, mikeos",
  location     = "http://mikeos.sourceforge.net/write-your-own-os.html"
}

